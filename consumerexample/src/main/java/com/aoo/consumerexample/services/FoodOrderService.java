package com.aoo.consumerexample.services;

import com.aoo.consumerexample.models.FoodOrder;
import com.aoo.consumerexample.repositories.FoodOrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FoodOrderService {
    private final FoodOrderRepository foodOrderRepository;
    public void persistFoodOrder(FoodOrder foodOrder){
        FoodOrder persistedFoodOrder = foodOrderRepository.save(foodOrder);
        log.info("food order persisted {}", persistedFoodOrder);
    }
    public List<FoodOrder> getALlOrders(){
        return foodOrderRepository.findAll();
    }

}
