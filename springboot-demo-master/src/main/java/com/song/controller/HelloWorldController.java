package com.song.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }
}
