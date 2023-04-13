package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing factory implement");

        ProductFactory factory = new ProductFactory();

        Product productA = factory.callToBuild("A");
        Product productB = factory.callToBuild("B");

        productA.buildProduct();
        productB.buildProduct();
    }
}