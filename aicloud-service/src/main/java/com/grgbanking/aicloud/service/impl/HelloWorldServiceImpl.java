package com.grgbanking.aicloud.service.impl;

import com.grgbanking.aicloud.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    public String index() {
        return "ABC";
    }
}
