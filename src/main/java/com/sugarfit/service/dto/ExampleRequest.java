package com.sugarfit.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ExampleRequest {

    @NotBlank
    private String userId;

    @NotNull
    private Integer value;
}
