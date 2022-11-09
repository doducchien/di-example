package com.example.diexample.controller;

import com.example.diexample.service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayHello();
    }
}
