package com.smirnov.helloworldaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public String getGreeting() {
        return "Hello World 1";
    }

}
