package com.test.entities;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by roka on 04.02.15.
 */
@Entity
@Table(name = "AUTOR")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTOR_ID", referencedColumnName = "ID")
    private List<Book> books;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Car> cars;


    public Autor() {
    }

    public Autor(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.cars = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }


    public List<Car> getCars() {
        return cars;
    }

    public void addBook(Book book){
        getBooks().add(book);
    }

    public void addCar(Car car){
        getCars().add(car);
    }
}
