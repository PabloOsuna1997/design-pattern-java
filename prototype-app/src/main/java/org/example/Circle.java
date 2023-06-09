package org.example;

import java.awt.*;

public class Circle extends Shape {
    public int radius;

    public Circle(){}
    public Circle (Circle target){
        super(target);
        if(target != null){
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", with=" + with +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
