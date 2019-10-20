package com.mk.xebia.solid;

public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double length) {
        super.setWidth(length);
        super.setLength(length);
    }
}
