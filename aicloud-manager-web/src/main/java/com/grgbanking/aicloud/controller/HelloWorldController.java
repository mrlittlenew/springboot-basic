package com.grgbanking.aicloud.controller;

import com.grgbanking.aicloud.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public String index(Model model,@RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name",helloWorldService.name(name));
        return "hello";
    }
}
