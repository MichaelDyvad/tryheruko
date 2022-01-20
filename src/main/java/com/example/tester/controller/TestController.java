package com.example.tester.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @GetMapping("/hello")
    public String hellotest(){
        return "index";
    }

    @PostMapping("/hello")
    public String helloPost(){
        return "index";
    }
}
