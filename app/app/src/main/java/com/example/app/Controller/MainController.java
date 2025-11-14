package com.example.app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class MainController {
    @GetMapping
    public String name(){
        return "Hello, I am Sahithi.";
    }
}
