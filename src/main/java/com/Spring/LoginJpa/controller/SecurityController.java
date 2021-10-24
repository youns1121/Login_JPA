package com.Spring.LoginJpa.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SecurityController {

    @GetMapping("/")
    public String index() {
        return "home";
    }


}
