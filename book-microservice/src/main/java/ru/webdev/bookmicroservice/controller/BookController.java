package ru.webdev.bookmicroservice.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.webdev.bookmicroservice.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {

    private List<Book> books = Arrays.asList(
            new Book(1, "Гарри Поттер", "Фентези", "Элиезер Юдковски"),
        new Book(2, "Война и мир", "Роман-эпопея", "Лев Николаевич Толстой"),
        new Book(3, "Солярис","Научная фантастика", "Станислав Лем")
    );

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id){
        return new ResponseEntity<>(books.get(id-1), HttpStatus.OK);
    }

}
