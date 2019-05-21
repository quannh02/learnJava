package com.mycompany.helloworldapp;

public class Rectangle extends Shape {
    Double width;
    Double height;

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    Rectangle(String name, Double width, Double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
}
