package com.example.teachereval;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.example.teachereval.dao")
public class TeacherevalApplication {
	public static void main(String[] args) {
		SpringApplication.run(TeacherevalApplication.class, args);
	}
}
