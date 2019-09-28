package com.springdatajdbc.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("demo.author")
public class Author {

    public @Id Long id;
    public String name;

    public Author(){
    }

    public Author(String name) {
        this.name = name;
    }
}
