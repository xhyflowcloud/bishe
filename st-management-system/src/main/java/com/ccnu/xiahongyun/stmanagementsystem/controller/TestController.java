package com.ccnu.xiahongyun.stmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @GetMapping("/hello")
    public String getHello(){
        return "/index";
    }
}
