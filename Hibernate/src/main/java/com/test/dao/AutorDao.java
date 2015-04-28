package com.test.dao;

import com.test.entities.Autor;
import com.test.entities.Book;

import java.util.List;

/**
 * Created by roka on 04.02.15.
 */
public interface AutorDao {

    Autor getByName(String name);

    void update(Autor autor);

    List<Autor> findAll();

}
