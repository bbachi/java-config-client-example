package com.bbtutorials.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Value("${config.environment}")
    private String environment;
	
	@Value("${message}")
    private String message;
 
    @GetMapping("/hello")
    public String hello() {
        return "Hello " + this.message + " " + this.environment;
    }

}
