package dio.apirest.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
