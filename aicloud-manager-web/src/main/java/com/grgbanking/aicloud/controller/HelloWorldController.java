package com.grgbanking.aicloud.controller;

import com.grgbanking.aicloud.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World:"+helloWorldService.index();
    }
}