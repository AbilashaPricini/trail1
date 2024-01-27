package com.example.annotations.controller;

import com.example.annotations.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
    //localhost:8080/api/user
    @RequestMapping(method = RequestMethod.GET, path = "/api/user")
    @GetMapping(path = "/api/user")
    public ResponseEntity<User> getUser(){
        User user = new User();
        user.setName("abilasha");
        user.setAge(25);
        user.setCity("Kodaikanal");
        user.setCountry("India");
        return ResponseEntity.ok(user);
    }
}
