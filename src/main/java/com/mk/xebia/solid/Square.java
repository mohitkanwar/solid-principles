package com.mk.xebia.solid;

public class Ostrich implements Bird {

    @Override
    public void eat(double foodQuantity) {
        // do sometihing
    }

    @Override
    public void chirp() {
        // do something

    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
