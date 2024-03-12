package com.algoExpert.demo;

import com.algoExpert.demo.Repository.TaskRepository;
import com.algoExpert.demo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  DemoApplication {
	@Autowired
	private TaskService taskService;

	public static void main(String[] args) {


		SpringApplication.run(DemoApplication.class, args);

	}

}
