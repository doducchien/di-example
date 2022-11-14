package com.example.diexample.i18config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.diexample.service.I18nEnServiceImpl;
import com.example.diexample.service.I18nVnServiceImpl;

@Configuration
public class I18Config {
    


    @Bean
    @Profile({"EN"})
    I18nEnServiceImpl i18nEnServiceImp(){
        return new I18nEnServiceImpl();
    }

    @Bean
    @Profile({"VN", "default"})
    I18nVnServiceImpl i18nVnServiceImpl(){
        return new I18nVnServiceImpl();
    }
}
