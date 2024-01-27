package io.aiven.spring.mysql.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/demo")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public @ResponseBody User addNewUser(@RequestParam String name, @RequestParam String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

    @GetMapping("/all")
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
