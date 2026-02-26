package com.sugarfit.service.controller;

import com.sugarfit.service.dto.ExampleRequest;
import com.sugarfit.service.dto.ExampleResponse;
import com.sugarfit.service.service.ExampleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
@RequiredArgsConstructor
public class ExampleController {

    private final ExampleService exampleService;

    @PostMapping
    public ResponseEntity<ExampleResponse> process(
            @Valid @RequestBody ExampleRequest request) {

        return ResponseEntity.ok(exampleService.process(request));
    }
}
