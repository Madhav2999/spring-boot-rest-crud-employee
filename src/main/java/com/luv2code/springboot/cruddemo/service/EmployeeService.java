package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService  {
    List<Employee> findALL();
    //Optional<Employee> findById(int theId);

    Employee save(Employee theEmployee);

    Optional<Employee> findById(Integer theId);

    Optional<Employee> findByEmail(String email);

    void deleteById(int theId);
}
