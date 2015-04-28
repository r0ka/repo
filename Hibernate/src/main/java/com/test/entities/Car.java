package com.test.entities;

import javax.persistence.*;

/**
 * Created by roka on 04.02.15.
 */
@Entity
@Table(name = "CAR")
public class Car {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "AUTOR_ID")
    private Autor autor;

    public Car(String name, Autor autor) {
        this.name = name;
        this.autor = autor;
    }

    public Car() {
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
