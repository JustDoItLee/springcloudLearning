package com.example.sericefeigndemo.controller;

import com.example.sericefeigndemo.service.SchedualServiceHi;
import com.example.sericefeigndemo.service.SchedualServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @Autowired
    SchedualServiceUser schedualServiceUser;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @GetMapping(value = "/hello")
    public String sayHelo(@RequestParam String name) {
        return schedualServiceUser.sayHelloFromClientOne(name);
    }
}
