package com.luv2code.springboot.cruddemo.rest;
import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api")
public class EmployeesRestController
{
    private EmployeeService employeeService;
    public EmployeesRestController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> findALL()
    {
        return employeeService.findALL();
    }
    @GetMapping ("/employees/id/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId)
    {

        Employee theEmployee = employeeService.findById(employeeId);
        if(theEmployee==null)
        {
            throw new RuntimeException("Employee id not found");
        }
        return theEmployee;
    }
    @GetMapping ("/employees/email/{emailI}")
    public List<Employee> getEmployee(String emailI)
    {
        List<Employee>theEmployee =  employeeService.findByEmail(emailI);
        if(theEmployee.size()==0)
        {
            throw new RuntimeException("Employee id not found");
        }
        return theEmployee;
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee)
    {
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee)
    {
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }
    //add mapping to delete the employee
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId)
    {
        Employee tempEmployee = employeeService.findById(employeeId);
        if(tempEmployee==null)
        {
            throw new RuntimeException("Exception id not found - "+employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted employee id - "+employeeId;
    }

}
