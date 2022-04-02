package com.sspu.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sun
 * @date 2022/4/1 22:44
 */
@Controller
public class admin {
    @RequestMapping("admin")
    public String goadmin(){
    return "admin";
}
}