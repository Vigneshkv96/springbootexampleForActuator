package com.javaguides.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/Welcome")
    public String Welcome(){
        return "Welcome to Spring Boot World";
    }
}
