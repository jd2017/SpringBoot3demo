package com.example.demo.service;

import com.example.demo.dto.DemoTestUserDTO;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.DemoTestUser;
import util.R;

public interface User2Service {
    R login(UserDto userDto);
    R register(DemoTestUser demoTestUser);

    R findUser(DemoTestUser demoTestUser);

    R updateUser(DemoTestUserDTO demoTestUserDTO);

    R deleteUser(DemoTestUser demoTestUser);
}
