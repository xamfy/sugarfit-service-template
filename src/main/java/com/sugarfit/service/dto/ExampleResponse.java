package com.sugarfit.service.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ExampleResponse {

    private String status;
    private String requestId;
}
