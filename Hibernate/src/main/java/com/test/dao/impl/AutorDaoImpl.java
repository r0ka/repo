package com.test.dao.impl;

import com.test.dao.AutorDao;
import com.test.entities.Autor;
import com.test.entities.Book;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by roka on 04.02.15.
 */
public class AutorDaoImpl implements AutorDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public Autor getByName(String name) {
        Query query =  sessionFactory.getCurrentSession().createQuery("from Autor b where b.name = :name ");
        query.setString("name", name);
        query.setMaxResults(1);
        List autorList = query.list();
        return  autorList.isEmpty() ? null : (Autor)autorList.get(0);
    }

    @Override
    @Transactional
    public void update(Autor autor) {

        sessionFactory.getCurrentSession().saveOrUpdate(autor);

    }

    @Override
    @Transactional
    @SuppressWarnings(value = "unchecked")
    public List<Autor> findAll() {
        Query query =  sessionFactory.getCurrentSession().createQuery("from Autor ");
        return query.list();
    }
}
