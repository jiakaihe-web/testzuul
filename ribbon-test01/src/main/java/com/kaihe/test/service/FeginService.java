package com.kaihe.test.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ribbon02")
public interface FeginService {

    @RequestMapping("test01")
    String test01(@RequestParam("name")String name);
}
