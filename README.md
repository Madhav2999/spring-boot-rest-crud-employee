# spring-boot-rest-crud-employee
 
The following employee crud (create read update and delete) application is designed in springboot . It contains 6 methods:
1- List<Employee>findAll()
It fetches all the employees present in our database by using GetMapping(@GetMapping("/employees"))
![image](https://github.com/Madhav2999/spring-boot-rest-crud-employee/assets/73338753/9dedef19-e4ee-4ca9-8fba-95e3129b8531)
2- Employee getEmployee(@PathVariable int employeeId)
It fetches the details of a single employee on the basis of employeeId by using GetMapping(@GetMapping ("/employees/id/{employeeId}"))
![image](https://github.com/Madhav2999/spring-boot-rest-crud-employee/assets/73338753/32352bcd-f3da-4a60-8d6b-126a9b2cdda8)
3- List<Employee> getEmployee(String emailId)
It fetches the details of a single employee on the basis of emailId by using GetMapping (@GetMapping ("/employees/id/{emailId}"))
4-  Employee addEmployee(@RequestBody Employee theEmployee)
It adds the employee to the database by using PostMapping(@PostMapping("/employees"))
![image](https://github.com/Madhav2999/spring-boot-rest-crud-employee/assets/73338753/bd3d8f68-a132-48df-a82c-b0d04a5ae1aa)
![image](https://github.com/Madhav2999/spring-boot-rest-crud-employee/assets/73338753/b9ec46b2-4ef8-4983-8075-9ae35bb2b94e)
5 - Employee updateEmployee(@RequestBody Employee theEmployee)
It updates the employee by using the PutMapping (@PutMapping("/employees"))
![image](https://github.com/Madhav2999/spring-boot-rest-crud-employee/assets/73338753/233b8e51-59ef-4125-941b-3479a1fd01fd)
6 - public String deleteEmployee(@PathVariable int employeeId)
It deletes the employee by using the DeleteMapping (@DeleteMapping("/employees/{employeeId}"))
![image](https://github.com/Madhav2999/spring-boot-rest-crud-employee/assets/73338753/604bd054-6cc5-4d9f-b654-c64cede779c4)

The following app works in the following way:
The Rest controller interacts with the Service package which further interacts with the DAO package where the methods have been implemented using the entitymanager
![image](https://github.com/Madhav2999/spring-boot-rest-crud-employee/assets/73338753/2ddb8bfb-e11e-4caf-86b8-3aae2662a5fd)





