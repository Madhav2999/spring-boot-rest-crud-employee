package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    public EmployeeServiceImpl()
    {

    }
    @Autowired
    private EmployeeDAO employeeDAO;
    //public EmployeeServiceImpl(EmployeeDAO employeeDAO)
    {
        this.employeeDAO = employeeDAO;
    }
    @Override
    public List<Employee> findALL() {
        return employeeDAO.findAll();
    }

    @Override
    public Optional<Employee> findById(Integer theId) {

        return employeeDAO.findById(theId);
    }
    @Override
    public Optional<Employee> findByEmail(String email){return employeeDAO.findByEmail(email);}
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }
}
