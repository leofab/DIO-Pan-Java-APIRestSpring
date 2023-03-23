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


}
