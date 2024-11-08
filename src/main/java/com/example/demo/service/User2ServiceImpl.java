package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;
import util.R;


@Service("user2")
public class User2ServiceImpl implements User2Service {

    @Override
    public R login(UserDto userDto){
        if(userDto.getUsername().equals("jd") && userDto.getPassword().equals("123456")){
           return R.ok().data((userDto)).code(1000).message("登录成功");
        }else {
//            return "用户名密码错误" +userDto.getUsername()+"password:"+userDto.getPassword();
            return R.error().data((userDto)).code(4000).message("登录失败");
        }
    }
}
