package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        if (elements.length != 3) {
            throw new RuntimeException("Ошибка: формат выражения неверен");
        }
        int num1 = checkElement(elements[0]);
        int num2 = checkElement(elements[2]);
        String operation = elements[1];
        return switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> (double) num1 / num2;
            case "%" -> num1 % num2;
            case "^" -> Math.pow(num1, num2);
            default -> throw new RuntimeException("Ошибка: математическая операция " + operation + " не поддерживается");
        };
    }

    private static int checkElement(String element) {
        int mathExpressionNum;
        try {
            mathExpressionNum = Integer.parseInt(element);
        } catch (RuntimeException exception) {
            throw new RuntimeException("Ошибка: " + element + " не является целым числом");
        }
        if (mathExpressionNum <= 0) {
            throw new RuntimeException("Ошибка: " + mathExpressionNum + " не является положительным числом");
        }
        return mathExpressionNum;
    }
}