package com.kodilla.zneref.testing.shape.model;

import com.kodilla.zneref.testing.shape.model.Shape;

import java.util.Objects;

public class Triangle extends Shape {
    private double lengthA;
    private double lengthH;

    public Triangle(String name, double lengthA, double lengthH) {
        super(name);
        this.lengthA = lengthA;
        this.lengthH = lengthH;
    }

    @Override
    public double field() {
        return (lengthA * lengthH) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.lengthA, lengthA) == 0 &&
                Double.compare(triangle.lengthH, lengthH) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), lengthA, lengthH);
    }
}
