package com.example.diexample.controller;

import org.springframework.stereotype.Controller;

import com.example.diexample.service.I18nService;

@Controller
public class MyController {

    public MyController(I18nService i18nService) {
        this.i18nService = i18nService;
    }
    private I18nService i18nService;

    

    public String sayHello(){
        System.out.println("Hello world");
        return "Hi Hoa !";
    }
    public String testLang(){
        return i18nService.sayHello();
    }
}
