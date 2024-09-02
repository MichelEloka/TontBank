package com.tontbank.tontbank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstMessage {
    
    @RequestMapping
    public String sayHello(){
        return "bonjour";

    }
}
