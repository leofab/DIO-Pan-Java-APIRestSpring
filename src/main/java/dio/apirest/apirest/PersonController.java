package dio.apirest.apirest;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }

    // Métodos de requisição

    //@GetMapping("/home")
    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(){
        return ("This is my first API in Spring Boot");
    }

    @GetMapping("/persons")
    public List<Person> consultAllPersons(){
        return repositoryPerson.findAll();
    }

    @GetMapping("/persons/{id}")
    public Optional<Person> consultById(@PathVariable Long id){
        return repositoryPerson.findById(id);
    }



}
