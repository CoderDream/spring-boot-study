package com.bjc.bjcsso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String get(){
        return "test success";
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world <img src=\"images/gitlab.png\">";
    }

}
