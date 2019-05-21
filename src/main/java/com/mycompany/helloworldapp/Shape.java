package com.mycompany.helloworldapp;

abstract class Shape {
    String name;
    Double x, y;
    Shape(String name) {
        this.name = name;
    }

    public void moveTo(int x, int y) {
        System.out.println(this.name + " is moving from x = " + x + ", y = " + y);
    }

    abstract public double area();
    abstract public void draw();
}
