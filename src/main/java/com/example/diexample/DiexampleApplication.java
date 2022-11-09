package com.example.diexample;

import com.example.diexample.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiexampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiexampleApplication.class, args);
		MyController myController =(MyController) ctx.getBean("myController");
		String result = myController.sayHello();
		System.out.println(result);
	}

}
