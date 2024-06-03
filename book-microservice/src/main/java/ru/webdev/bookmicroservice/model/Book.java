package ru.webdev.bookmicroservice.model;

public class Book {
    private int id;

    private String title;

    private String genre;

    private String Author;

    public Book() {
    }

    public Book(int id, String title, String genre, String author) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        Author = author;
    }
}
