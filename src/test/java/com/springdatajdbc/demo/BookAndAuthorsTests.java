package com.springdatajdbc.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJdbcTest
@ContextConfiguration(classes = AppConfig.class)
public class BookAndAuthorsTests {

    @Autowired
    BookRepository books;

    @Autowired
    AuthorRepository authors;

    @Test
    public void createAuthorsAndBooks() {

        Author author = new Author();
        author.name = "Greg L. Turnquist";

        author = authors.save(author);

        Book book = new Book();
        book.title = "Spring Boot";
        book.addAuthor(author);

        books.save(book);

        books.deleteAll();

        assertThat(authors.count()).isEqualTo(1);
    }
}
