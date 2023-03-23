package apirest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository){ this.repository = repository; }

    @GetMapping("/employees")
    public List<Employee> listOfAllEmployee(){
        return repository.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee consultById(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/employees")
    public Employee newEmployee(@RequestBody Employee newEmployee){
        return repository.save(newEmployee);
    }

    // modificação parcial
    @PutMapping("/employess/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, Long id) {
        return repository.findById(id).map(employee -> {
           employee.setName(newEmployee.getName());
           employee.setRole(newEmployee.getRole());
           employee.setAddress(newEmployee.getAddress());
           return repository.save(employee);
        }).orElseGet(() -> {
            newEmployee.setId(id);
            return repository.save(newEmployee);
        });
    }


}
