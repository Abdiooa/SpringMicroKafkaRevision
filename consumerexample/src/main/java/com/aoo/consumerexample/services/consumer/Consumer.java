package com.aoo.consumerexample.services.consumer;

import com.aoo.consumerexample.models.FoodOrder;
import com.aoo.consumerexample.models.dto.FoodOrderDto;
import com.aoo.consumerexample.services.FoodOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;


@Slf4j
@Component
@RequiredArgsConstructor
public class Consumer {

    private static final String topicName = "${tpd.topic-name}";
    private final FoodOrderService foodOrderService;
    private final ModelMapper modelMapper;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = topicName, clientIdPrefix = "json",
            containerFactory = "kafkaListenerContainerFactory")
    public void consumeMessage(@Payload Map<String, Object> payload){
        log.info("message consumed {}", payload);
        FoodOrderDto foodOrderDto = objectMapper.convertValue(payload,FoodOrderDto.class);
        FoodOrder foodOrder = modelMapper.map(foodOrderDto,FoodOrder.class);
        foodOrderService.persistFoodOrder(foodOrder);
    }
}
