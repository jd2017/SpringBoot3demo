package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.annotation.MapperScan;

//启动类，默认一般创建为：artifactId+Application, 类名必须以Application结尾
@SpringBootApplication
@MapperScan("com.example.demo.dao") // 替换为你的 Mapper 接口所在的包
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
