package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class JDBCConfiguration {
    @Value("${jdbc.driverName}")
    String driverName;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.name}")
    String name;
    @Value("${jdbc.password}")
    String password;

    @Bean
    public HashMap<String,String>  getJDBC() {
        HashMap<String,String> map = new HashMap<>();
        map.put("driverName",driverName);
        map.put("url",url);
        map.put("name",name);
        map.put("password",password);
        return map;
    }
}
