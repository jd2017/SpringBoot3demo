package com.example.demo.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@Tag(name = "请求类功能控制器", description = "这是控制器的描述")
public class FirsterController {

    @GetMapping(path = "/first")
    String firstContrellor(){
        return "hello controllor!";
    }

    @GetMapping("/topic/{id}")
    @Operation(summary = "获取示例信息")
    String firstContrellor(@PathVariable("id")  String tid){
        return "hello " +tid+ " springboot!";
    }
    @GetMapping("/native")
    String getNative(@RequestParam("s") String tid){
        return "hello " + tid+ " springboot!";
    }
    @GetMapping("/native/{id}")
    String getURIwithParam(@PathVariable  String id ,
                            @RequestParam(defaultValue = "beijing") String tid){
        return "hello id: " + id+ " springboot! "+ tid;
    }
    @GetMapping("/native/{city}/{year}")
    String getURIwithParams(@PathVariable  String city ,
                           @PathVariable   int year ,
                           @RequestParam(required = false) String  describe,
                           @RequestParam(defaultValue = "beijing") String str){
        return "hello describe: " + describe+ " springboot! "+ str;
    }
}

