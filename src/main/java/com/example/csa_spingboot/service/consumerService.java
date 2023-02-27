package com.example.csa_spingboot.service;


import com.example.csa_spingboot.entity.consumer;

import java.util.List;

public interface consumerService{
    boolean batchRemoveUser(List<Integer> ids);
    Integer getUserNum();
    Integer getUserOfMan();
    boolean isExistUser(String username);
    consumer getUserByName(String username);
    List<consumer> getUserByIds(List<Integer> ids);
}
