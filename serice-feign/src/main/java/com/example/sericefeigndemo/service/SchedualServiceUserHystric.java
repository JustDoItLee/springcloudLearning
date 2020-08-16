package com.example.sericefeigndemo.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceUserHystric implements SchedualServiceUser {
    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry " + name;
    }
}
