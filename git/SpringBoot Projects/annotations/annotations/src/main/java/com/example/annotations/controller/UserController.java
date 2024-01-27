package com.example.annotations.controller;

import com.example.annotations.model.User;
import com.example.annotations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
//@RequestMapping("api/users")
public class UserController {

    @Autowired
    public UserService service;
    //get all the users
    //localhost:9090/api/users
    @RequestMapping(method = RequestMethod.GET, path = "api/users")
    public List<User> getAllUsers(){
        System.out.println("in user controller");
        return service.getAllUsers();
    }

    /*//get specific user based on id
    //localhost:9090/api/users/user/25
    @GetMapping(path = "/user/{id}")
    public User getUserById(@PathVariable("id") String age){
        return service.getUser(Integer.parseInt(age));
    }

    //get both name and age
    //localhost:9090/api/users/user/{id}/{name}
    @GetMapping("/user/{age}/{name}")
    public User getUserByAgeAndName(@PathVariable String age, @PathVariable String name){
        System.out.println("age : " + age + " , name : " + name);
        return service.getUserByAgeAndName(Integer.parseInt(age), name);
    }

    //multiple path variables - handles by Map
    @GetMapping("/user/{age}/{name}/{city}")
    public User getUserByNameAgeCity(@PathVariable Map<String, String> allParams){
        return service.getUserByNameAgeCity(Integer.parseInt(allParams.get("age")), allParams.get("name"));
    }*/

    //optional path variable
    //localhost:9090/api/users/user/{id}/{name}
    /*@GetMapping(path = {"/user/{age}", "/user/{age}/{name}"})
    public User getUserByIdOrName(@PathVariable String age, @PathVariable(required = false) String name){
        System.out.println("age : " + age + " , name : " + name);
        if(name!=null && name.length()>0){
            return service.getUserByAgeAndName(Integer.parseInt(age), name);
        }else{
            return service.getUser(Integer.parseInt(age));
        }*/

    //using optional java 8 function
    /*@GetMapping(path = {"/user/{age}", "/user/{age}/{name}"})
    public User getUserByIdOrName(@PathVariable String age, @PathVariable Optional<String> name){
        System.out.println("age : " + age + " , name : " + name);
        if(name.isPresent()){
            return service.getUserByAgeAndName(Integer.parseInt(age), name.get());
        }else{
            return service.getUser(Integer.parseInt(age));
        }

    }*/

    //query param - RequestParam
    //localhost:9090/api/users/user?age=26
//    @GetMapping("/user")
//    public User getUserByAge(@RequestParam String age, @RequestParam Optional<String> name){
//        if(name.isPresent()){
//            System.out.println(age + " " + name);
//           return service.getUserByAgeAndName(Integer.parseInt(age), name.get());
//        }else{
//            System.out.println(age + " " + name);
//            return service.getUser(Integer.parseInt(age));
//        }
//    }

    //using default value
    /*@GetMapping("/user")
    public User getUserByDefaultValue(@RequestParam String age, @RequestParam(defaultValue = "abcd") String name){
        System.out.println(age + " " + name);
        return service.getUser(Integer.parseInt(age));
    }*/

    //using map
    /*@GetMapping("/user")
    public User getUserByAgeMap(@RequestParam Map<String, String> allParam){
        System.out.println(allParam.get("age") + " " + allParam.get("name"));
        return service.getUserByAgeAndName(Integer.parseInt(allParam.get("age")), allParam.get("name"));
    }*/

    @PostMapping(path = "/api/users",
                 consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<User> addNewUser(@RequestBody User newUser){
        User user = service.addNewUser(newUser);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
