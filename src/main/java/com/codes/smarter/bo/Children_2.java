package com.codes.smarter.bo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect
public class Children_2 {
    int selected;
    List<Children_2> children;
    List<String> entity;
    String name;
    String id;
    String max_selection;
    String type;
    String sel_dep;
    String min_selection;
    String description;
    String price;
    String max_price;
}
