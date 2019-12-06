package com.kaihe.test.controller;

import com.kaihe.test.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    FeginService feginService;

    @RequestMapping("test01/{name}")
    public String test(@PathVariable String name){
        return feginService.test01( name );
    }

}
