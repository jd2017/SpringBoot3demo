package com.example.demo.controller;

import com.example.demo.dto.DemoTestUserDTO;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.DemoTestUser;
import com.example.demo.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import util.R;

@RestController
public class UserController {

    @Autowired
    User2Service user2Service;

    @PostMapping(value = "/login2",produces = "application/json")
    R login(@RequestBody UserDto userDto){
        return user2Service.login(userDto);
    }
    @PostMapping(value = "/register",produces = "application/json")
    R register(@RequestBody DemoTestUser demoTestUser){

        return user2Service.register(demoTestUser);
    }
    @PostMapping(value = "/findUser",produces = "application/json")
    R findUser(@RequestBody DemoTestUser demoTestUser){
        return user2Service.findUser(demoTestUser);
    }
    @PostMapping(value = "/updateUser",produces = "application/json")
    R updateUser(@RequestBody DemoTestUserDTO demoTestUserDTO){
        return user2Service.updateUser(demoTestUserDTO);
    }
    @PostMapping(value = "/deleteUser",produces = "application/json")
    R deleteUser(@RequestBody DemoTestUser demoTestUser){
        return user2Service.deleteUser(demoTestUser);
    }

}
