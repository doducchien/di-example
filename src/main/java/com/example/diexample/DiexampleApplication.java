package com.example.diexample;

import com.example.diexample.controller.MyController;
import com.example.diexample.datasoruce.Datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiexampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiexampleApplication.class, args);
		MyController myController =(MyController) ctx.getBean("myController");
		String result = myController.testLang();
		System.out.println(result);

		Datasource datasource = ctx.getBean(Datasource.class);
		System.out.println(datasource.getUsername());
		System.out.println(datasource.getPassword());
		System.out.println(datasource.getJdbcUrl());
	}

}
