package com.example.demo.converter;

import com.example.demo.dto.DemoTestUserDTO;
import com.example.demo.entity.DemoTestUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.context.annotation.ComponentScan;

@Mapper(componentModel = "spring")
@ComponentScan
public interface DemoTestUserConverter {
//    DemoTestUserDTO-->DemoTestUser
    @Mappings({
            @Mapping(target = "userName",source = "name"),
            @Mapping(target = "password",source = "password"),
            @Mapping(target = "email",source = "email")
    })
    DemoTestUser toDemoTestUser(DemoTestUserDTO demoTestUserDTO);

}
