package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private int num1;
    private int num2;
    private String operation;

    public double calculate(String mathExpression) {
        String[] mathExpressionArray = mathExpression.split(" ");
        num1 = Integer.parseInt(mathExpressionArray[0]);
        num2 = Integer.parseInt(mathExpressionArray[2]);
        operation = mathExpressionArray[1];
        double result;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = (double) num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Ошибка: знак " + operation + " не поддерживается");
                return Double.MIN_VALUE;
        }
        System.out.print(num1 + " " + operation + " " + num2 + " = ");
        System.out.print(result - (int) result == 0 ? (int) result + "\n" : String.format("%.3f\n", result));
        return result;
    }
}