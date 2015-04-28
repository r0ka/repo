package com.test.entities;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * Created by roka on 13.01.15.
 */
@Entity
@Table(name = "POINT")
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name="X")
    public Long x;

    @Column(name="Y")
    public Long y;

    public Point() {
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Point(Long x, Long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        if (y != point.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Long result = x;
        result = 31 * result + y;
        return 31;
    }


}
