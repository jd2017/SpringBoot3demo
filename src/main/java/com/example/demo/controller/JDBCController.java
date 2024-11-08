package com.example.demo.controller;

import com.example.demo.configuration.JDBCConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class JDBCController{

    @Autowired
    JDBCConfiguration jdbcConfiguration;

    @GetMapping(value = "/getJdbc", produces = "application/json")
    HashMap<String,String> getJDBC(){
        return  jdbcConfiguration.getJDBC();
    }
}
