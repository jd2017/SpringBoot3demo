package com.example.demo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

    @Value("${android.deviceName:honor}")
    private  String deviceName;

    @GetMapping(value = {"/native/{did}/u", "/native/u"})
    String getURIwithParams(@PathVariable  (value = "did",required = false) String topid,
                           @RequestParam (defaultValue = "2020") int sid ){
        System.out.println("配置文件"+deviceName);
        return "hello topid: " + topid+ " springboot sid! "+ sid;
    }
}

