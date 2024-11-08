package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.R;

@RestController
public class UserController {

    @Autowired
    User2Service user2;

    @PostMapping(value = "/login2",produces = "application/json")
    R login(@RequestBody UserDto userDto){
        return user2.login(userDto);
    }
}
