package com.test.dao.impl;

import com.test.dao.BookDao;
import com.test.entities.Book;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;


/**
 * Created by roka on 04.02.15.
 */

public class BookDaoImpl implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public Book getByName(String name) {
        Query query =  sessionFactory.getCurrentSession().createQuery("from Book b where b.name = :name ");
        query.setString("name", name);
        query.setMaxResults(1);
        List bookList = query.list();
        return  bookList.isEmpty() ? null : (Book)bookList.get(0);

    }

    @Override
    @Transactional
    public void update(Book book) {
        sessionFactory.getCurrentSession().saveOrUpdate(book);
    }

    @Override
    @Transactional
    @SuppressWarnings(value = "unchecked")
    public List<Book> findAll() {
        Query query =  sessionFactory.getCurrentSession().createQuery("from Book ");
        return query.list();
    }
}
