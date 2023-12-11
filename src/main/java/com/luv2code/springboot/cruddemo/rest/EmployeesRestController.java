package com.luv2code.springboot.cruddemo.rest;
import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeesRestController
{
    public EmployeesRestController()
    {

    }
    @Autowired
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

        Optional<Employee> theEmployee = employeeService.findById(employeeId);
        if(theEmployee.isPresent())
        {
            return theEmployee.get();
        }
        throw new RuntimeException("not found");

    }
    @RequestMapping(value = "/employees/email/{email}",method = RequestMethod.GET)
    public Employee getEmployeeByEmail(@PathVariable String email)
    {
        Optional<Employee> e = employeeService.findByEmail(email);
        //List<Employee>theEmployee =  employeeService.findByEmail(emailId);
        if(e.isPresent())
        {
            return e.get();
        }
         throw new RuntimeException("not found");
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
        Optional<Employee> tempEmployee = employeeService.findById(employeeId);
        if(tempEmployee.isEmpty())
        {
            throw new RuntimeException("Exception id not found - "+employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted employee id - "+employeeId;
    }

}
