package com.example.springbbotapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbbotapplication.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
