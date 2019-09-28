package com.springdatajdbc.demo;

import org.springframework.data.annotation.Id;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.Set;

public class Book {

    private @Id
    Long id;
    public String title;

    private Set<AuthorRef> authors = new HashSet<>();

    public Book() {

    }

    Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(createAuthorRef(author));
    }

    private AuthorRef createAuthorRef(Author author) {

        Assert.notNull(author, "Author must not be null");
        Assert.notNull(author.id, "Author id, must not be null");

        AuthorRef authorRef = new AuthorRef();
        authorRef.author = author.id;
        return authorRef;
    }
}
