package com.example.project;

public class Calculator{
    private String calcModel;

    // Constructor
    public Calculator(String calcType) {
        calcModel = calcType;
    }
   
    public double performOperation(String operand, int num1, int num2) {
        switch (operand) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return (double) num1 / num2;
                } else {
                    return 0.00;
                }
            default:
                return 0.00;
        }
    }

    public boolean divisibleBy(int num1, int num2) {
        if (num2 == 0) {
            return false;  // Division by zero is undefined
        }
        return num1 % num2 == 0;
    }

    public String coordinatePair(int x, int y) {
        return "(" + x + "," + y + ")";
    }

    public int absoluteValue(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    // Method that returns the model information of the calculator
    public String info() {
        return "This calculator is a model " + calcModel + " where " + calcModel +  " should be filled in with the value stored in the calcModel instance variable.";
    }
}



