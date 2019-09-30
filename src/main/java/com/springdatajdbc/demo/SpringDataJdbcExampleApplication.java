package com.springdatajdbc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJdbcExampleApplication implements CommandLineRunner {

    @Autowired
    BookRepository books;

    @Autowired
    AuthorRepository authors;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        author.name = "Greg L. Turnquist";

        author = authors.save(author);

        Book book = new Book();
        book.title = "Spring Boot";
        book.addAuthor(author);

        books.save(book);

        books.deleteAll();
    }

}
