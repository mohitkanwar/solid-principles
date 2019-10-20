package com.mk.xebia.solid;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate("3+5"));
        System.out.println(calculator.calculate("3-5"));
        System.out.println(calculator.calculate("3*5"));
        System.out.println(calculator.calculate("3/5"));
    }

    private double calculate(String input) {
       double firstInput = getFirstInput(input);
       String operation = getOperation(input);
       OperationFactory operationFactory = new OperationFactory();
       double secondInput = getSecondInput(input,operation);
       return operationFactory.getOperation(operation).operate(firstInput,secondInput);
    }

    private double getSecondInput(String input, String operation) {
        int operationPosition = input.indexOf(operation);
        return Double.parseDouble(input.substring(operationPosition+1));
    }

    private String getOperation(String input) {
        String operation = "+";
        String[] inputs = input.split("");
        for (int i=0;i<inputs.length;i++){
            try{
               Integer.parseInt(inputs[i]);
            }
            catch (NumberFormatException e){
                operation = inputs[i];
            }

        }
        return operation;
    }

    private double getFirstInput(String input) {
        double value = 0;
        String[] inputs = input.split("");
        for (int i=0;i<inputs.length;i++){
            try{
                int a = Integer.parseInt(inputs[i]);
                value = 10 * value + a;
            }
            catch (NumberFormatException e){
                return value;
            }

        }
        return value;
    }
}


