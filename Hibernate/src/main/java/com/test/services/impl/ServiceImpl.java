package com.test.services.impl;

import com.test.entities.Autor;
import com.test.entities.Book;
import com.test.entities.Car;
import com.test.entities.Point;
import com.test.services.Service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by roka on 09.10.14.
 */

public class ServiceImpl implements Service {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void create() {
        Session session = sessionFactory.getCurrentSession();
        Point point = new Point(1L,1L);
        session.beginTransaction();
        session.save(point);
        session.getTransaction().commit();

    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void oneToMany(){
        Session session = sessionFactory.getCurrentSession();

        Autor autor = new Autor("Roka");
        Book book = new Book("Best");
        Book book2 = new Book("Best2");
        autor.addBook(book);
        autor.addBook(book2);
        Car car1 = new Car("BMW", autor);
        Car car2 = new Car("FORD", autor);
        autor.addCar(car1);
        autor.addCar(car2);
        session.save(autor);
        System.out.println("asd");

    }



}
