package com.in28minutes.rest.webservices.restfulwebservices.dao;

import com.in28minutes.rest.webservices.restfulwebservices.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> userList = new ArrayList<>();

    private static int idCount = 0;

    static{
        userList.add(new User(++idCount, "Adam", LocalDate.now().minusYears(30)));
        userList.add(new User(++idCount, "Eve", LocalDate.now().minusYears(25)));
        userList.add(new User(++idCount, "Jim", LocalDate.now().minusYears(20)));

    }

    public List<User> findAll(){
        return userList;
    }

    public User findById(int id){
        /*User user = null;
        for(User u : userList){
            if(u.getId() == id)
                user = u;
        }
        return user;*/
        Predicate<User> predicate = user -> user.getId().equals(id);
        return userList.stream()
                .filter(predicate)
                .findFirst()
                .orElse(null);
    }

    public User save(User user){
        user.setId(++idCount);
        userList.add(user);
        return user;
    }

    public void deleteUser(int id) {

        Predicate<? super User> predicate = user -> user.getId().equals(id);
        userList.removeIf(predicate);

        /*User user = null;
        for(User u : userList){
            if(u.getId().equals(id)){
                userList.remove(u);
                user = u;
            }
        }
        return user;*/
    }
}
