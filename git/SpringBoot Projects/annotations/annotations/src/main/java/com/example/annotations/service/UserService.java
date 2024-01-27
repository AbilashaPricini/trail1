package com.example.annotations.service;

import com.example.annotations.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    static List<User> userList;
    static {
        userList = new ArrayList<>();
        userList.add(new User("Subramani", 26, "Kodaikanal", "India"));
        userList.add(new User("Abilasha", 25, "Kodaikanal", "India"));
        userList.add(new User("Pranika", 6, "Chennai","India"));
        userList.add(new User("Tarakesh", 15, "Karur", "India"));
    }


    public List<User> getAllUsers() {
        return userList;
    }

    public User getUser(int age) {
        User user = null;

        for(User user1: userList){
            if(user1.getAge() == age){
                user = user1;
                break;
            }
        }
        //System.out.println(user);
        return user;
    }

    public User getUserByAgeAndName(int age, String name) {
        User user = null;
        for(User u : userList){
            if(u.getAge() == age && u.getName().equalsIgnoreCase(name)){
                user = u;
            }
        }
        return user;
    }

    public User getUserByNameAgeCity(int age, String name) {
        User user = null;
        for(User u : userList){
            if(u.getAge() == age && u.getName().equalsIgnoreCase(name)){
                user = u;
                break;
            }
        }
        return user;
    }

    public List<User> getUserList(List<Integer> age){
        List<User> newList = new ArrayList<>();

        for(User u : userList){
            if(age.contains(u.getAge())){
                newList.add(u);
            }
        }
        return newList;
    }

    public User addNewUser(User newUser) {
        userList.add(newUser);
        return userList.get(userList.size()-1);
    }
}
