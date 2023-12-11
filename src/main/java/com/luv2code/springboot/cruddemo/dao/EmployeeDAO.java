package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO extends JpaRepository<Employee,Integer>
{
//    List<Employee> findALL();
//
//    Employee findById(int theId);
//
//    Employee save(Employee theEmployee);
//
//    Employee findByEmail(String email);
//
//    void deleteById(int theId);
    Optional<Employee> findByEmail(String email);
    Optional<Employee> findByEmailAndId(String email,Integer id);
}
