package dio.apirest.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PersonController {

    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }

    // Métodos de requisição

    @GetMapping("/persons")
    public Person consultAllPersons(){
        return (Person) repositoryPerson.findAll();
    }

    @PostMapping("/persons/{id}")
    public Optional<Person> consultById(@PathVariable Long id){
        return repositoryPerson.findById(id);
    }



}
