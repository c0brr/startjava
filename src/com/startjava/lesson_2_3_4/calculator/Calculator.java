package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private static int num1;
    private static int num2;
    private static String operation;

    public static double calculate(String mathExpression) throws RuntimeException {
        String[] elements = mathExpression.split(" ");
        if (elements.length != 3) {
            throw new RuntimeException("Ошибка: формат выражения неверен");
        } else {
            checkElement(elements[0]);
            num1 = Integer.parseInt(elements[0]);
            checkElement(elements[2]);
            num2 = Integer.parseInt(elements[2]);
            operation = elements[1];
            return switch (operation) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> (double) num1 / num2;
                case "%" -> num1 % num2;
                case "^" -> Math.pow(num1, num2);
                default -> throw new RuntimeException("Ошибка: математическая операция не поддерживается");
            };
        }
    }

    private static void checkElement(String element) {
        try {
            int num = Integer.parseInt(element);
            if (num <= 0) {
                throw new RuntimeException("Ошибка: " + element + " не является положительным целым числом");
            }
        } catch (RuntimeException exception) {
            throw new RuntimeException("Ошибка: " + element + " не является положительным целым числом");
        }
    }
}