package com.example.diexample.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.diexample.datasoruce.Datasource;


@Configuration
@EnableConfigurationProperties(DataBaseConfig.class)
// @PropertySource("classpath:datasource.properties")
public class CustomizeConfig {
    
    // @Bean
    // Datasource datasource(
    //     @Value("${datasource.username}") String username,
    //     @Value("${datasource.password}") String password,
    //     @Value("${datasource.jdbcUrl}") String jdbcUrl
    // ){
    //     Datasource datasource = new Datasource();
    //     datasource.setUsername(username);
    //     datasource.setPassword(password);
    //     datasource.setJdbcUrl(jdbcUrl);
    //     return datasource;
    // }

    @Bean
    Datasource datasource(DataBaseConfig dataBaseConfig){
        Datasource datasource = new Datasource();
        datasource.setUsername(dataBaseConfig.getUsername());
        datasource.setPassword(dataBaseConfig.getPassword());
        datasource.setJdbcUrl(dataBaseConfig.getJdbcUrl());

        return datasource;
    }   
}
