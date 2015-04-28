package com.test.entities;

import javax.persistence.Entity;

/**
 * Created by roka on 13.01.15.
 */
@Entity
public class ColoredPoint extends Point{

    public String color;

    public ColoredPoint(Long x, Long y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColoredPoint)) return false;
        if (!super.equals(o)) return false;

        ColoredPoint that = (ColoredPoint) o;

        if (!color.equals(that.color)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color.hashCode();
        return 31;
    }
}
