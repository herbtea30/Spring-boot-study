package com.herbtea.study.springbootstudy.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/user/info")
    public User getUser(){
        User user = new User();

        user.setId("herbtea");
        user.setName("dony");
        user.setEmail("herbtea@gpin.co.kr");

        return user;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
