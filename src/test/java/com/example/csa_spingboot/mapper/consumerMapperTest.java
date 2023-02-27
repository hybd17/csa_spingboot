package com.example.csa_spingboot.mapper;

import com.example.csa_spingboot.entity.consumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class consumerMapperTest {
    @Resource
    private consumerMapper consumerMapper;

    @Test
    public void test1(){
        int userNum = consumerMapper.getUserNum();
        System.out.println(userNum);
    }
    @Test
    public void test2(){
        int manNum = consumerMapper.getManNum();
        System.out.println(manNum);
    }
    @Test
    public void test03(){
        List<Integer> ids = Arrays.asList(1, 2);
        List<consumer> userByIds = consumerMapper.getUserByIds(ids);
        System.out.println(userByIds);
    }
    @Test
    public void test04(){
        consumer user = consumerMapper.getUserByName("张三");
        System.out.println(user);
    }
}
