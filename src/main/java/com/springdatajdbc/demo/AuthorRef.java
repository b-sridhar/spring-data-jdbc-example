package com.springdatajdbc.demo;

import org.springframework.data.relational.core.mapping.Table;


@Table("demo.book_author")
class AuthorRef {

    public Long author;
}