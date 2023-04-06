package com.mvc.mvc.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Mycontroler {
    @GetMapping("/greeting")
    public String greeting(){
        return "greeting";
    }

}
