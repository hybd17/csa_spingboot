package com.example.csa_spingboot.controller;

import com.example.csa_spingboot.entity.JsonResult;
import com.example.csa_spingboot.entity.consumer;
import com.example.csa_spingboot.service.consumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.csa_spingboot.controller.BaseController.win;

@RestController
@RequestMapping("/consumer")
public class consumerController {
        List<Integer> idsLast = Arrays.asList(1,2);

    @Resource
    private consumerService consumerService;

    @RequestMapping("/batch")
    public JsonResult<Void> batchDelete(){
        List<Integer> ids = Arrays.asList(1,2);
        boolean res = consumerService.batchRemoveUser(ids);
        return new JsonResult<>(win,"删除成功");
    }

    @RequestMapping("/getAllNum")
    public JsonResult<Integer> getUserNum(){
        Integer num = consumerService.getUserNum();
        return new JsonResult<>(win,num);
    }

    @RequestMapping("/getManNum")
    public JsonResult<Integer> getManNum(){
        Integer userOfMan = consumerService.getUserOfMan();
        return new JsonResult<>(win,userOfMan);
    }

    @RequestMapping("/judgeExist")
    public JsonResult<Boolean> isExistUser(String username){
        boolean existUser = consumerService.isExistUser(username);
        return new JsonResult<>(win,existUser);
    }

    @RequestMapping("/getUserByName")
    public JsonResult<consumer> getUserByName(String username){
        consumer user = consumerService.getUserByName(username);
        return new JsonResult<>(win,user);
    }

    @RequestMapping("/getUserById")
    public JsonResult<List<consumer>> getUserById(List<Integer> idsLast){
        List<consumer> users = consumerService.getUserByIds(idsLast);
        return new JsonResult<>(win,users);
    }
}
