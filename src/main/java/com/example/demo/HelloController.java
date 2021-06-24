package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "HELLO";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "GoodBye";
    }
}
