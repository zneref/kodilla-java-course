package com.kodilla.zneref.testing.shape.model;

import com.kodilla.zneref.testing.shape.model.Shape;

import java.util.Objects;

public class Square extends Shape {
    private double lengthA;

    public Square(String name, double lengthA) {
        super(name);
        this.lengthA = lengthA;

    }

    @Override
    public double field() {
        return Math.pow(lengthA, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.lengthA, lengthA) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), lengthA);
    }
}
