package apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository){ this.repository = repository; }

    @GetMapping("/employees")
    public List<Employee> listOfAllEmployee(){
        return repository.findAll();
    }

}
