package com.employeeReferal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @RequestMapping("/home")
    public String hiMadhu(){
        return "Welcome madhu";
    }
}
