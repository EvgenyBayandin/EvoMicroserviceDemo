package ru.webdev.personwithbookmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.webdev.personwithbookmicroservice.model.Book;
import ru.webdev.personwithbookmicroservice.model.Person;


@RestController
@RequestMapping("/reader")
public class PersonWithBookController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/{personId}/{bookId}")
    public ResponseEntity<Person> reader(@PathVariable int personId, @PathVariable int bookId) {
        Person person = restTemplate.getForObject("http://person-microservice/person/" + personId, Person.class);
        Book book  = restTemplate.getForObject("http://book-microservice/book/"  + bookId, Book.class);
        person.setBook(book);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }
}
