package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private int num1;
    private int num2;
    private String operation;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return  num2;
    }

    public String getOperation() {
        return operation;
    }

    public double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        num1 = Integer.parseInt(elements[0]);
        num2 = Integer.parseInt(elements[2]);
        operation = elements[1];
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return (double) num1 / num2;
            case "%":
                return num1 % num2;
            case "^":
                return Math.pow(num1, num2);
            default:
                return Double.MIN_VALUE;
        }
    }
}