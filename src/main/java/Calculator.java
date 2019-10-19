

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate("3+5"));
        System.out.println(calculator.calculate("3-5"));
        System.out.println(calculator.calculate("3*5"));
        System.out.println(calculator.calculate("3/5"));
    }

    private double calculate(String input) {
        String[] inputs = input.split("");

        double returnValue = 0;
        for (int i=0;i<inputs.length;i++){
            String val = inputs[i];
            if(val.equals("+")){
                returnValue = returnValue + Double.valueOf(inputs[i+1]);
                i++;
            }
            else if(val.equals("-")){
                returnValue = returnValue - Double.valueOf(inputs[i+1]);
                i++;
            }
            else if(val.equals("*")){
                returnValue = returnValue * Double.valueOf(inputs[i+1]);
                i++;
            }
            else if(val.equals("/")){
                returnValue = returnValue / Double.valueOf(inputs[i+1]);
                i++;
            }
            else {
                returnValue = Double.valueOf(inputs[i]);
            }

        }

        return returnValue;
    }
}
