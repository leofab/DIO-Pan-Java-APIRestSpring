package dio.apirest.apirest;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {

    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }

    // Métodos de requisição

    @GetMapping("/")
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(){
        return ("This is my first API in Spring Boot");
    }

    @GetMapping("/persons")
    public Person consultAllPersons(){
        return (Person) repositoryPerson.findAll();
    }

    @PostMapping("/persons/{id}")
    public Optional<Person> consultById(@PathVariable Long id){
        return repositoryPerson.findById(id);
    }



}
