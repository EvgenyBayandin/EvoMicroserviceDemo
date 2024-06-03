package ru.webdev.personmicroservice.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.webdev.personmicroservice.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

    private List<Person> persons = Arrays.asList(
            new Person(1, "Иван", 30),
            new Person(2,  "Петр",  40),
            new Person(3,  "Сергей",  50)
    );

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Integer id){
        return  new ResponseEntity<>(persons.get(id-1), HttpStatus.OK);
    }

}
