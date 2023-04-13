package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Circle circle = new Circle();
        circle.radius = 10;
        circle.with = 10;
        circle.height = 10;
        circle.color = "red";

        Rectangle rec = new Rectangle();
        rec.with = 10;
        rec.height = 10;
        rec.color = "blue";
        rec.x = 10;
        rec.y = 20;

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rec);

        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape shape: shapes) {
            shapesCopy.add(shape.clone());
        }

        System.out.println("ORIGINAL: ");
        for (Shape shape:shapes) {
            System.out.println(shape.toString());
        }

        System.out.println("---------------");

        System.out.println("COPY: ");
        for (Shape shapeCopy: shapesCopy) {
            System.out.println(shapeCopy.toString());
        }
    }
}