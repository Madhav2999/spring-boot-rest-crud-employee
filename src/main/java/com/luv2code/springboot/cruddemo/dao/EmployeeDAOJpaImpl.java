package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO
{
    //define field for entitymanager
    private EntityManager entityManager;
    //setup constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }
    @Override
    public List<Employee> findALL()
    {
        //create a query
        TypedQuery<Employee>theQuery = entityManager.createQuery("from Employee",Employee.class);
        //execute query and get result list
        List<Employee>employees = theQuery.getResultList();
        //return the results
        return employees;
    }

    @Override
    public Employee findById(int theId)
    {
        //get employee
        Employee theEmployee = entityManager.find(Employee.class,theId);
        //return employee
        return theEmployee;
    }
    @Override
    public List<Employee> findByEmail(String email)
    {
        //Employee theEmployee = entityManager.find(Employee.class,email);
        //return theEmployee;
        TypedQuery<Employee>theQuery = entityManager.createQuery("SELECT e FROM Employee e WHERE e.email = :email",Employee.class);
//        //execute query and get result list
        List<Employee>employees = theQuery.getResultList();
//        //return the results
        return employees;
    }
    @Override
    public Employee save(Employee theEmployee)
    {
        //save employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        //return the dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId)
    {
        //find employee by id
        Employee theEmployee = entityManager.find(Employee.class,theId);
        //remove the employee
        entityManager.remove(theEmployee);
    }
}
