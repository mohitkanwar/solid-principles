package com.mk.xebia.solid;

public class Division implements Operation {
    public double operate(double operand1, double operand2) {
        return operand1 / operand2;
    }

    @Override
    public String getSymbol() {
        return "/";
    }
}
