package com.example.csa_spingboot.mapper;

import com.example.csa_spingboot.entity.consumer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface consumerMapper {
    Integer batchRemoveUser(List<Integer> ids);
    Integer getUserNum();
    Integer getManNum();
    Integer isExists(String username);
    consumer getUserByName(String username);
    List<consumer> getUserByIds(List<Integer> ids);
}
