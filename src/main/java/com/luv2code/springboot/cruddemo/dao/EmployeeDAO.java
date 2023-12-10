package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> findALL();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    List<Employee> findByEmail(String email);

    void deleteById(int theId);
}
