package com.codes.smarter.bo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect
public class Menu {
    int min_selection;
    int max_selection;
    int id;
    String description;
    String type;
    String name;
    List<Children_1> children;
}