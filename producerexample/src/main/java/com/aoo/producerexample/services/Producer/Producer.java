package com.aoo.producerexample.services.Producer;

import com.aoo.producerexample.models.FoodOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Producer {
    @Value("${tpd.topic-name}")
    private String topicName;
    private final KafkaTemplate<String,Object> kafkaTemplate;
    public String sendMessage(FoodOrder foodOrder) throws JsonProcessingException{
        kafkaTemplate.send(topicName,foodOrder);
        log.info(" food order produced ");
        return "message sent";
    }
}
