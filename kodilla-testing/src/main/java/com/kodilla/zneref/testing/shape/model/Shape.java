package com.kodilla.zneref.testing.shape.model;

import java.util.Objects;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public abstract double field();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
