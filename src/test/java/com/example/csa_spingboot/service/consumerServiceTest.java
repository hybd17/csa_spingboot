package com.example.csa_spingboot.service;


import com.example.csa_spingboot.entity.consumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class consumerServiceTest {

    @Resource
    private consumerService consumerService;

    @Test
    public void test01(){
        Integer num = consumerService.getUserNum();
        System.out.println(num);
    }

    @Test
    public void test02(){
        Integer user = consumerService.getUserOfMan();
        System.out.println(user);
    }

    @Test
    public void test03(){
        boolean user = consumerService.isExistUser("李四");
        System.out.println(user);
    }

    @Test
    public void test04(){
        consumer user = consumerService.getUserByName("张三");
        System.out.println(user);
    }

    @Test
    public void test05(){
        List<Integer> ids = Arrays.asList(1,2);
        List<consumer> userByIds = consumerService.getUserByIds(ids);
        System.out.println(userByIds);
    }
}
