package com.spring_webapp.spring_web_app;

import com.spring_webapp.spring_web_app.entity.Employee;
import com.spring_webapp.spring_web_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringWebAppApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppApplication.class, args);
	}

	@Override
	public void run(String... args)throws Exception{
		List<Employee> tbl_employees = employeeRepo.findAll();
		tbl_employees.forEach(System.out :: println);
	}

}
