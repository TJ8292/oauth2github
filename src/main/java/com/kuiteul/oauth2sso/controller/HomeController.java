package com.kuiteul.oauth2sso.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/home")
    public String home(OAuth2AuthenticationToken token) {
        LOG.info(token.toString());
        return "home.html";
    }

}
