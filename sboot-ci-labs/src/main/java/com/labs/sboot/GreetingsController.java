package com.labs.sboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public String greet() {
        return "Welcome to GitHub Actions CI Labs";
    }
}
