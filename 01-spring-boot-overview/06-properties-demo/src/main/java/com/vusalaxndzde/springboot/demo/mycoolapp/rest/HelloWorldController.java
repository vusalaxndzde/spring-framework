package com.vusalaxndzde.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${player.name}")
    private String playerName;
    
    @Value("${team.name}")
    private String teamName;

    @GetMapping("teaminfo")
    public String getTeamInfo() {
        return "Team: " + teamName + ", Player: " + playerName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String workout() {
        return "Run a hard 5k!";
    }
    
}
