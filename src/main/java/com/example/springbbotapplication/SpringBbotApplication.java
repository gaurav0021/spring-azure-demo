package com.example.springbbotapplication;

import com.example.springbbotapplication.entity.Employee;
import com.example.springbbotapplication.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBbotApplication {

	@Autowired
    private EmployeeRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(SpringBbotApplication.class, args);
    }

    @GetMapping("/")
    public String entry() {
        return "Welcomes in Spring Boot Application";
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return repo.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return repo.findAll();
    }
}
