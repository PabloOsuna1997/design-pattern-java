package org.example;

public class ProductFactory {
    public Product callToBuild(String type){
        if(type.equals("A")){
            return new ProductA();
        }else if (type.equals("B")) {
            return new ProductB();
        }else {
            throw new IllegalArgumentException("Type of service don't exist");
        }
    }
}
