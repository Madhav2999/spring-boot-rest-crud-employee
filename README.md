# spring-boot-rest-crud-employee
 
The following employee crud (create read update and delete) application is designed in springboot . It contains 6 methods:
1- List<Employee>findAll()
It fetches all the employees present in our database by using GetMapping(@GetMapping("/employees"))
2- Employee getEmployee(@PathVariable int employeeId)
It fetches the details of a single employee on the basis of employeeId by using GetMapping(@GetMapping ("/employees/id/{employeeId}"))
3- List<Employee> getEmployee(String emailId)
It fetches the details of a single employee on the basis of emailId by using GetMapping (@GetMapping ("/employees/id/{emailId}"))
4-  Employee addEmployee(@RequestBody Employee theEmployee)
It adds the employee to the database by using PostMapping(@PostMapping("/employees"))
5 - Employee updateEmployee(@RequestBody Employee theEmployee)
It updates the employee by using the PutMapping (@PutMapping("/employees"))
6 - public String deleteEmployee(@PathVariable int employeeId)
It deletes the employee by using the DeleteMapping (@DeleteMapping("/employees/{employeeId}"))

The following app works in the following way:
The Rest controller interacts with the Service package which further interacts with the DAO package where the methods have been implemented using the entitymanager
SCREENSHOTS:


