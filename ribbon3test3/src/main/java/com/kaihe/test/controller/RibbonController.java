package com.kaihe.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @RequestMapping("test01")
    public String test(String name){
        System.out.println("=========name===="+name);
        return "t3";
    }

}
