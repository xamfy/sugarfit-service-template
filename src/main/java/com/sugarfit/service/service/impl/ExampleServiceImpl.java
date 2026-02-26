package com.sugarfit.service.service.impl;

import com.sugarfit.service.dto.ExampleRequest;
import com.sugarfit.service.dto.ExampleResponse;
import com.sugarfit.service.service.ExampleService;
import com.sugarfit.service.util.RequestIdGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {

    @Override
    public ExampleResponse process(ExampleRequest request) {

        String requestId = RequestIdGenerator.generate();

        log.info("Processing request for userId={}, requestId={}",
                request.getUserId(), requestId);

        return ExampleResponse.builder()
                .status("SUCCESS")
                .requestId(requestId)
                .build();
    }
}
