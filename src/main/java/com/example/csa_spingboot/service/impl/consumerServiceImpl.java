package com.example.csa_spingboot.service.impl;

import com.example.csa_spingboot.entity.consumer;
import com.example.csa_spingboot.mapper.consumerMapper;
import com.example.csa_spingboot.service.consumerService;
import com.example.csa_spingboot.service.ex.consumerNotExist;
import com.example.csa_spingboot.service.ex.serverDownException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class consumerServiceImpl implements consumerService {

    @Resource
    private consumerMapper consumerMapper;

    @Override
    public boolean batchRemoveUser(List<Integer> ids) {
        int res = consumerMapper.batchRemoveUser(ids);
        if(res==1){
            return true;
        }
        else
            return false;
    }

    @Override
    public Integer getUserNum() {
        Integer result = consumerMapper.getUserNum();
        if (result==null){
            throw new serverDownException("服务器产生未知错误");
        }
        return result;
    }

    @Override
    public Integer getUserOfMan() {
        Integer result = consumerMapper.getManNum();
        if (result==null){
            throw new serverDownException("服务器产生未知错误");
        }
        return result;
    }

    @Override
    public boolean isExistUser(String username) {
        Integer result = 0;
        result = consumerMapper.isExists(username);
        if(result==1){
            return true;
        }
        else{
            throw new consumerNotExist("用户不存在");
        }
    }

    @Override
    public consumer getUserByName(String username) {
        consumer consumer = consumerMapper.getUserByName(username);
        if (consumer==null){
            throw new consumerNotExist("用户不存在");
        }
        return consumer;
    }

    @Override
    public List<consumer> getUserByIds(List<Integer> ids) {
        List<consumer> consumers = consumerMapper.getUserByIds(ids);
        for (consumer consumer :
                consumers) {
            if (consumer==null){
                throw new consumerNotExist("所输入id中有非法id");
            }
        }
        return consumers;
    }
}
