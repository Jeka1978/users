package com.creditguard.controllers;

import com.creditguard.model.Person;
import com.creditguard.services.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Evegeny on 18/12/2016.
 */
//@RequestMapping("/api")
//@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/person/save")
    public String saveUser(@RequestBody Person person) {
        userService.saveUser(person);
        return "ok";
    }

    @GetMapping("users/foryossi")
    public List<Person> user(HttpServletRequest httpRequest) {
        int age = Integer.parseInt(httpRequest.getParameter("age"));
        return userService.findByAgeGreaterThan(age);
    }

    @GetMapping("users/{age}")
    public List<Person> findUsers(@PathVariable int age) {
        return userService.findByAgeGreaterThan(age);
    }


    @GetMapping("/ping")
    public String ping() {
        return "hello world";
    }
}
