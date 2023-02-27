package com.example.csa_spingboot.controller;

import com.example.csa_spingboot.entity.JsonResult;
import com.example.csa_spingboot.service.ex.consumerNotExist;
import com.example.csa_spingboot.service.ex.serverDownException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.sql.rowset.serial.SerialException;

//异常规划
public class BaseController {
    public static final int win = 200;
    @ExceptionHandler({SerialException.class})
    public JsonResult<Void> handleException(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);
        if(e instanceof consumerNotExist){
            result.setState(300);
            result.setMessage("用户不存在的错误");
        } else if (e instanceof serverDownException) {
            result.setState(5000);
            result.setMessage("服务器产生未知错误");
        }
        return result;
    }
}
