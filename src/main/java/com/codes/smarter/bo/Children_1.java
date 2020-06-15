package com.codes.smarter.bo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect
public class Children_1 {
    int selected;
    int quantity;
    List<String> warning;
    String instruction;
    List<Children_2> children;
    List<String> entity;
    int instruction_index;
    float score;
    List<String> not_found;
    String name;
    String id;
    String description;
    String price;
    String increment;
    String max_qty;
    String min_qty;
    String type;
    String max_price;
}
