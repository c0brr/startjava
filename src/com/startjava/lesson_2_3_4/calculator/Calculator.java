package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private int num1;
    private int num2;
    private String operation;

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

    public void printResult(String mathExpression) {
        double result = calculate(mathExpression);
        if (result == Double.MIN_VALUE) {
            System.out.println("Ошибка: знак " + operation + " не поддерживается");
        } else {
            System.out.print(num1 + " " + operation + " " + num2 + " = ");
            System.out.print(result - (int) result == 0 ? (int) result + "\n" : String.format("%.3f\n", result));
        }
    }
}