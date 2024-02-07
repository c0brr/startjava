package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private static int num1;
    private static int num2;
    private static String operation;
    private static boolean hasException;

    public static void printResult(String mathExpression) {
        try {
            double result = calculate(mathExpression);
            if (!hasException) {
                System.out.print(num1 + " " + operation + " " + num2 + " = ");
                System.out.print(result - (int) result == 0 ? (int) result + "\n" : String.format("%.3f\n", result));
            }
        } catch (RuntimeException exception) {
            System.out.println("Ошибка: математическая операция не поддерживается");
        }
        hasException = false;
    }

    private static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        if (elements.length != 3) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException exception) {
                System.out.println("Ошибка: формат выражения неверен");
                hasException = true;
            }
        } else {
            try {
                num1 = Integer.parseInt(elements[0]);
                if (num1 <= 0) {
                    try {
                        throw new RuntimeException();
                    } catch (RuntimeException exception) {
                        printTermError("первый член выражения");
                        hasException = true;
                    }
                }
            } catch (RuntimeException exception) {
                printTermError("первый член выражения");
                hasException = true;
            }

            try {
                num2 = Integer.parseInt(elements[2]);
                if (num2 <= 0) {
                    try {
                        throw new RuntimeException();
                    } catch (RuntimeException exception) {
                        printTermError("второй член выражения");
                        hasException = true;
                    }
                }
            } catch (RuntimeException exception) {
                printTermError("второй член выражения");
                hasException = true;
            }
        }

        operation = elements[1];
        return switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> (double) num1 / num2;
            case "%" -> num1 % num2;
            case "^" -> Math.pow(num1, num2);
            default -> throw new RuntimeException();
        };
    }

    private static void printTermError(String term) {
        System.out.println("Ошибка: " + term + " не яляется целым положительным числом");
    }
}