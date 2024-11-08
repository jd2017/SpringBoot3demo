package com.example.demo.dto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "类用户登录信息",example = "{\"username\":\"用户名\",\"password\":\"用户密码\"}")
public class UserDto {
    String username;
    String password;
}
