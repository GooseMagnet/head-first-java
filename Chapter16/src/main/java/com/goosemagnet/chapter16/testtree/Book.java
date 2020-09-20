package com.goosemagnet.chapter16.testtree;

public class Book {

    String title;

    public Book(String t) {
        title = t;
    }

    public int compareTo(Book book) {
        return title.compareTo(book.title);
    }

    @Override
    public String toString() {
        return title;
    }
}
