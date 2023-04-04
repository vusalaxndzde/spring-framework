package com.vusalaxndzde.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String workout() {
        return "Run a hard 5k!";
    }

    

}
