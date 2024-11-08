package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasePostController{

    @Autowired
    @Qualifier("userp")
    UserService userService;

//    @PostMapping("/login")
//    String login(String username, String password){
//        return "用户名:"+username+" 密码:"+password;
//    }
    @Operation(summary = "登录接口",description = "这是一个接口登录的描述")
    @PostMapping(value = "/login",produces = "application/json")
    String login(@RequestBody UserDto userDto){
        return userService.login(userDto);
    }
    @Operation(summary = "注册接口",description = "这是一个接口注册的描述")
    @PostMapping(value = "/{module}/register",produces = "application/json")
    String registerWithParam(@RequestBody UserDto userDto,
                             @PathVariable String module,
                             @RequestParam String desc,
                             @RequestParam String age){
        return userService.registerWithParam(userDto,module,desc,age);
    }
}
