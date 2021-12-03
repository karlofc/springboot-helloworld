package com.example.helloworld.controllers;

import com.example.helloworld.domain.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public HelloWorld hello(){
        return new HelloWorld();
    }
}
