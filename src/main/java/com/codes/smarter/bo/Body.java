package com.codes.smarter.bo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect
public class Body {
    @JsonProperty("Recommendations")
    List<Recommendations> recommendations;
    List<String> special_instructions;
    Address address;
    String status;
}