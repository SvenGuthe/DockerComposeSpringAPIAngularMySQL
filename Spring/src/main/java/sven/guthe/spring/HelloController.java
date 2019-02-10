package sven.guthe.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    PersonRepository personRepository;

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/personen",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            path = "/personen",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Person addPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

}
