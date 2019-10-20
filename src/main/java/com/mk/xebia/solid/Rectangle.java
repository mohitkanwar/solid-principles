package com.mk.xebia.solid;

public class Rectangle implements Shape {

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getParameter() {
        return 2*length + 2*width;
    }
}
