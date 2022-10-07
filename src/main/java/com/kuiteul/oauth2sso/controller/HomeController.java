package com.kuiteul.oauth2sso.controller;


import com.kuiteul.oauth2sso.util.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }

}
