package com.example.springtest001.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    @GetMapping("/name")
    public String Hello(String name){
        return "HELLO SPRING";
    }
}
