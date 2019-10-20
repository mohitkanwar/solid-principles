package com.mk.xebia.solid;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(2);
        System.out.println(rectangle.getArea()==20);
        System.out.println(rectangle.getParameter()==24);
    }
}
