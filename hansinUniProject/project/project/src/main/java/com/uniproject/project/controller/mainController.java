package com.uniproject.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController
{
    @GetMapping("/")
    public String main()
    {
        return "integrated";
    }

    @GetMapping("/login.html")
    public String login()
    {
        return "login";
    }
}
