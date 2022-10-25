package com.example.hellow_world.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "hellow_world/welcome")
@CrossOrigin

public class UserComtroller {
    @GetMapping
    public String getUser(){
        return "Welcome to LOIT";

    }
}
