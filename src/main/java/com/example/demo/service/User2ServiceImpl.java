package com.example.demo.service;

import com.example.demo.converter.DemoTestUserConverter;
import com.example.demo.dao.DemoTestUserMapper;
import com.example.demo.dto.DemoTestUserDTO;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.DemoTestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import util.R;

import java.util.Date;
import java.util.List;


@Service
public class User2ServiceImpl implements User2Service {

    @Autowired
    DemoTestUserMapper demoTestUserMapper;

    @Autowired
    DemoTestUserConverter demoTestUserConverter;

    @Override
    public R login(UserDto userDto){
        if(userDto.getUsername().equals("jd") && userDto.getPassword().equals("123456")){
           return R.ok().data((userDto)).code(1000).message("登录成功");
        }else {
//            return "用户名密码错误" +userDto.getUsername()+"password:"+userDto.getPassword();
            return R.error().data((userDto)).code(4000).message("登录失败");
        }
    }

    @Override
    public R register(DemoTestUser testUser) {
        System.out.println(testUser);

        int num = demoTestUserMapper.insert(testUser);
        System.out.println(num);
        if (num > 0){
            return R.ok().data(testUser).code(1000).message("注册成功");
        }else{
            return R.error().data(testUser).code(4000).message("注册失败");
        }

    }
    @Override
    public R findUser(DemoTestUser demoTestUser) {
        DemoTestUser demoTestUser1 = demoTestUserMapper.selectOne(demoTestUser);
        if (demoTestUser1 != null){
            return R.ok().data(demoTestUser1).code(1000).message("查询成功");
        }else {
            return R.ok().data(demoTestUser1).code(4000).message("未查询到用户");
        }
    }

    @Override
    public R updateUser(DemoTestUserDTO demoTestUserDTO) {
        DemoTestUser demoTestUser = demoTestUserConverter.toDemoTestUser(demoTestUserDTO);

        Example example = new Example(DemoTestUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", demoTestUser.getId());
        List<DemoTestUser> demoTestUsers = demoTestUserMapper.selectByExample(example);
        DemoTestUser demoTestUser1 = demoTestUsers.get(0);
        if (demoTestUser1 != null){
            demoTestUser1.setUserName(demoTestUser.getUserName());
            demoTestUser1.setUpdateTime(new Date());
            demoTestUser1.setEmail(demoTestUser.getEmail());
            demoTestUser1.setAutoCreateCaseJobName(demoTestUser.getAutoCreateCaseJobName());

            demoTestUserMapper.updateByPrimaryKeySelective(demoTestUser1);
            return R.ok().data(demoTestUser1).code(1000).message("修改成功");
        }else {
            return R.error().data("未查询到用户信息").code(4000).message("修改失败");
        }
    }

    @Override
    public R deleteUser(DemoTestUser demoTestUser) {
        int num =demoTestUserMapper.deleteByPrimaryKey(demoTestUser.getId());
        if (num > 0){
            return R.ok().data(demoTestUser).message("删除成功");
        }else {
            return R.error().data(demoTestUser).message("删除失败");
        }
    }
}
