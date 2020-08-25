package com.myq.uidemo.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "/index";
    }

    @RequestMapping("/test")
    public String test(){
        return "/test";
    }

    @RequestMapping("/checkbox")
    public String checkbox(){
        return "/checkbox";
    }
}
