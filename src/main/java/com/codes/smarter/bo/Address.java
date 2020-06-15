package com.codes.smarter.bo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect
public class Address {
    String street;
    String neighborhood;
    String zip;
    String zip_code;
    String postal_code;
    String state;
    String city;
    String sublocality;
    float latitude;
    float longitude;
    String unit;
}