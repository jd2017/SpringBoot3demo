package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;


@Service("user")
public class UserServiceImpl implements UserService {


    @Override
    public  String login( UserDto userDto){

        if(userDto.getUsername().equals("jd") && userDto.getPassword().equals("123456")){
            return "用户登录成功，用户名："+userDto.getUsername()+"password:"+userDto.getPassword();
        }else {
            return "用户名密码错误" +userDto.getUsername()+"password:"+userDto.getPassword();
        }
    }
    @Override
    public String registerWithParam(UserDto userDto, String module, String desc, String age){
        return "注册成功："+userDto.getUsername()+"password:"+userDto.getPassword()+module+desc+age;
    }
}
