package com.test.services.impl;

import com.test.dao.AutorDao;
import com.test.entities.Autor;
import com.test.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/**
 * Created by roka on 04.02.15.
 */
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorDao autorDao;

    @Override
    @Transactional
    public Autor getByName(String name) {
        return autorDao.getByName(name);
    }
}
