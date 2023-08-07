package com.aoo.consumerexample.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import jakarta.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrder {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String item;
    private Double amount;
}