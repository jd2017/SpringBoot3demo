package com.example.demo.dto;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "类用户登录信息",example = "{\"username\":\"用户名\",\"password\":\"用户密码\"}")
public class UserDto {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String username;
    String password;
}
