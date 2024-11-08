package com.example.demo.service;

import com.example.demo.dto.UserDto;

public interface UserService {
    String login( UserDto userDto);
    String registerWithParam( UserDto userDto, String module, String desc, String age);

}
