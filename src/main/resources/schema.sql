create schema demo;

create TABLE demo.book (
  id     IDENTITY,
  title  VARCHAR(200)
);

create table demo.author (
  id IDENTITY,
  name VARchar(200)
);

create TABLE demo.book_author (
  author INTEGER,
  book INTEGER
);
