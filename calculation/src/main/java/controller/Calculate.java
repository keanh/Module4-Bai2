package controller;

public class Calculate {
    public static double calculator(double firstOperand, double secondOperand, char operator){
        switch (operator){
            case '+':
                return firstOperand+secondOperand;
            case '-':
                return firstOperand-secondOperand;
            case '*':
                return firstOperand*secondOperand;
            case '/':
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                }else {
                    throw new RuntimeException("Can't divive by zero");
                }
            default:
                throw new RuntimeException("Invalid opereation");
        }
    }
}
