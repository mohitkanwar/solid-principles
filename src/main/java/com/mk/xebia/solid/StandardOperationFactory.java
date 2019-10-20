package com.mk.xebia.solid;

public class StandardOperationFactory implements OperationFactory {

        public Operation getOperation(String op){
            switch (op){
                case "*":
                    return new Multiplication();
                case "/":
                    return new Division();
                case "-":
                    return new Subtraction();
                default:
                    return new Addition();
            }
        }

}
