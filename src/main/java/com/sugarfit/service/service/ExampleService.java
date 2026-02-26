package com.sugarfit.service.service;

import com.sugarfit.service.dto.ExampleRequest;
import com.sugarfit.service.dto.ExampleResponse;

public interface ExampleService {
    ExampleResponse process(ExampleRequest request);
}
