package com.second.second.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping("/greet")
    public String greetMessage(){
        return "hello second";
    }

    @GetMapping("/newmethod")
    public String secondTest(){
        return "second second";
    }

}
