package com.example.api_rest;

import com.example.api_rest.gen.GetEmploymentRequest;
import com.example.api_rest.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller

public class ApiRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}
}
