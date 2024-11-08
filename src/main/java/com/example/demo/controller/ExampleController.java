package com.example.demo.controller;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @Operation(summary = "获取示例信息")
    @GetMapping("/example/{id}")
    public String getExampleById(@PathVariable String id) {
        return "Example ID: " + id;
    }

}
