package com.aoo.producerexample.services.Producer;

import com.aoo.producerexample.models.FoodOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class FoodOrderService {
    private final Producer producer;
    public String createFoodOrder(FoodOrder foodOrder) throws JsonProcessingException{
        return producer.sendMessage(foodOrder);
    }
}
