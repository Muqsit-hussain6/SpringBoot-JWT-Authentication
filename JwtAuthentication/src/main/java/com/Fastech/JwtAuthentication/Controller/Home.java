package com.Fastech.JwtAuthentication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/welcome")
    public String welcome(){
        String text = "This is a private page  , this page is not allowed to unauthenticated Users";
        return text;
    }
    @RequestMapping("/getusers")
    public String getUser(){
    return "{\"name\":\"Muqsit\"}";
    }

}
