package com.kodilla.zneref.testing.shape;

import com.kodilla.zneref.testing.shape.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes;

    public ShapeCollector() { shapes = new ArrayList<>(); }

    public void addFigure(Shape shape) { shapes.add(shape); }

    public boolean removeFigure(Shape shape) { return shapes.remove(shape); }

    public Shape getFigure(int n) { return shapes.get(n); }

    public List<Shape> getFigures() { return shapes;}

    public void showFigures() {
        for (Shape s : shapes) System.out.println(s.name());
    }

    public int getShapesQuantity() { return shapes.size(); }
}
