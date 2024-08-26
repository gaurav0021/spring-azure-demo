package com.example.springbbotapplication;

import com.example.springboot.entity.Employee;
import com.example.springboot.repository.EmployeeRepository;
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
