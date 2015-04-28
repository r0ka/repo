package com.test;

import com.test.dao.AutorDao;
import com.test.dao.BookDao;
import com.test.entities.Autor;
import com.test.services.AutorService;
import com.test.services.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by roka on 21.09.14.
 */
public class Main {

    private static final ApplicationContext ac =
            new ClassPathXmlApplicationContext("spring-config.xml");
//

    public static void main(String[] args) {
        Service service = (Service)ac.getBean("service");
        BookDao bookDao = (BookDao)ac.getBean("bookDao");
        AutorService autorService = (AutorService)ac.getBean("autorService");
        service.oneToMany();

        bookDao.getByName("Best");
        bookDao.getByName("Best2");

        Autor autor  = autorService.getByName("Roka");
        System.out.println("asd");



    }
}
