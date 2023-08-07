package com.aoo.producerexample.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Value;

@Data
@Value
public class FoodOrder {
    @JsonProperty("item")
    String item;
    @JsonProperty("amount")
    Double amount;
}
