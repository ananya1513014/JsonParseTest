package com.codes.smarter.bo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect
public class Recommendations {
    @JsonProperty("RestaurantID")
    String restaurantId;
    int minimum;
    List<String> payment_types;
    String delivery_charge;
    String phone;
    String num_ratings;
    String overall_rating;
    String merchant_score;
    Location location;
    @JsonProperty("RestaurantName")
    String restaurantName;
    List<String> items_not_found;
    String delivery_percent;
    List<Menu> menu;
}
