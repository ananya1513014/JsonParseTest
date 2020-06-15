package com.codes.smarter.bo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect
public class Root {
    String api_version;
    List<String> bugged_versions;
    String message;
    Body body;
    String status;
}
