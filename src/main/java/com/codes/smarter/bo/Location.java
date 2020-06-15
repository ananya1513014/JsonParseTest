package com.codes.smarter.bo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect
public class Location {
    String zip;
    String distance;
    String city;
    String street;
    String state;

}
