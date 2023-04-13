package org.example;

public abstract class Shape {
    public int with;
    public int height;
    public String color;

    public Shape(){}

    public Shape(Shape target){
        if (target != null) {
            this.with = target.with;
            this.height = target.height;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

}
