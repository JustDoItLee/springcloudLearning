package com.example.eureka.servicehi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HelloController {
    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "这里是user接口的hello" + name;
    }
}
