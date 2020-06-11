package com.wenyu.manger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class EmployeemangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeemangerApplication.class, args);
		int i= 20;
		
    }

}
