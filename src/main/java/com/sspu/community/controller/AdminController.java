package com.sspu.community.controller;

import com.sspu.community.dto.Admin;
import com.sspu.community.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sun
 * @date 2022/4/1 20:55
 */
@RestController
public class AdminController {

    @Autowired
    private AdminMapper adminMapper;
    @RequestMapping(path = "/adminlogin")
    public String login(String username ,String password){
        Admin admin = adminMapper.selectByUsernameAndPassword(username,password);
        if(admin == null){
            return "fail";
        }
        return "success";
    }
}
