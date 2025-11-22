package com.example.library_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Backend World 5";
    }

    @GetMapping("/")
    public String welcomeMessage(){
        return "This is just a starting many miles to go";
    }
}
