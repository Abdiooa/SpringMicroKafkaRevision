package com.aoo.consumerexample.controllers;

import com.aoo.consumerexample.models.FoodOrder;
import com.aoo.consumerexample.services.FoodOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class FoodOrderConsController {
    private final FoodOrderService foodOrderService;
    @GetMapping("")
    public List<FoodOrder> getAllOrders(){
        return foodOrderService.getALlOrders();
    }
}
