package com.aoo.consumerexample.repositories;

import com.aoo.consumerexample.models.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder,Long> {
}
