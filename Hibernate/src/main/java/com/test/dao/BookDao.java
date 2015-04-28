package com.test.dao;

import com.test.entities.Book;

import java.util.List;

/**
 * Created by roka on 04.02.15.
 */
public interface  BookDao {

    Book getByName(String name);

    void update(Book book);

    List<Book> findAll();
}
