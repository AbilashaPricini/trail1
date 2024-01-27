package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //localhost:9090/print
    @GetMapping("/hello")
    public String printHelloWorld(){
        System.out.println("Hello World");
        return "Hello, World!";
    }
}
