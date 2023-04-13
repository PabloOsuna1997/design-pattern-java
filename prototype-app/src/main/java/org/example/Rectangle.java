package org.example;

public class Rectangle extends Shape{
    public int x;
    public int y;

    public Rectangle(){}
    public Rectangle(Rectangle target){
        super(target);
        if(target != null){
            this.x = target.x;
            this.y = target.y;
        }
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", with=" + with +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
