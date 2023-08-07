package com.aoo.producerexample.controllers;

import com.aoo.producerexample.models.FoodOrder;
import com.aoo.producerexample.services.Producer.FoodOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class FoodOrderController {
    private final FoodOrderService foodOrderService;
    @PostMapping("")
    public String createFoodOrder(@RequestBody FoodOrder foodOrder) throws JsonProcessingException{
        log.info("create food order request received");
        return foodOrderService.createFoodOrder(foodOrder);
    }
}
