package com.example.demo123.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Stream;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping()
    public String getMainPage(){
        return "index.html";
    }
}
