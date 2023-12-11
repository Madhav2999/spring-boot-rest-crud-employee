package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class EmployeeDAOJpaImpl
{
    //define field for entitymanager
//    private EntityManager entityManager;
//    //setup constructor injection
//    public EmployeeDAOJpaImpl()
//    {
//
//    }
//    @Autowired
//    public EmployeeDAOJpaImpl(EntityManager entityManager)
//    {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public List<Employee> findALL() {
//        //create a query
//        TypedQuery<Employee>theQuery = entityManager.createQuery("from Employee",Employee.class);
//        //execute query and get result list
//        List<Employee>employees = theQuery.getResultList();
//        //return the results
//        return employees;
//    }
//
//    @Override
//    public Employee findById(int theId)
//    {
//        //get employee
//        Employee theEmployee = entityManager.find(Employee.class,theId);
//        //return employee
//        return theEmployee;
//    }
//    @Override
//    public Employee findByEmail(String email)
//    {
//        Employee theEmployee = entityManager.find(Employee.class,email);
//        return theEmployee;
//        //TypedQuery<Employee>theQuery = entityManager.createQuery("SELECT e FROM Employee e WHERE e.email = :email",Employee.class);
////        //execute query and get result list
//         //List<Employee>employees = theQuery.getResultList();
////        //return the results
//        //return theEmployee;
//         //return employees;
//    }
//    @Override
//    public Employee save(Employee theEmployee)
//    {
//        //save employee
//        Employee dbEmployee = entityManager.merge(theEmployee);
//
//        //return the dbEmployee
//        return dbEmployee;
//    }
//
//    @Override
//    public void deleteById(int theId)
//    {
//        //find employee by id
//        Employee theEmployee = entityManager.find(Employee.class,theId);
//        //remove the employee
//        entityManager.remove(theEmployee);
//    }
}
