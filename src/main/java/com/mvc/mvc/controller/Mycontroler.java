package com.mvc.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroler {
    @GetMapping("/greeting")
    public String greeting(){
        return "greeting";
    }
    @GetMapping("/greeting/message")
    public String message(Model model){
         model.addAttribute("message", "This is custom message");
        return "message";

    }

}
