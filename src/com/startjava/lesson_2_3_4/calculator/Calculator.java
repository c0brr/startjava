package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private static int num1;
    private static int num2;
    private static String operation;
    private static boolean hasException;

    public static void setHasException(boolean hasException) {
        Calculator.hasException = hasException;
    }

    public static void printResult(double result) {
        if (!hasException) {
            System.out.print(num1 + " " + operation + " " + num2 + " = ");
            System.out.print(result - (int) result == 0 ? (int) result + "\n" : String.format("%.3f\n", result));
        }
    }

    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        RuntimeException formatError = new RuntimeException("Ошибка: формат выражения неверен");
        RuntimeException integerNumError = new RuntimeException("Ошибка: один либо оба члена выражения " +
                "не являются положительными целыми числами");
        RuntimeException operationError = new RuntimeException("Ошибка: введенная математическая " +
                "операция не поддерживается");

        if (elements.length != 3) {
            hasException = true;
            throw formatError;
        } else {
            try {
                num1 = Integer.parseInt(elements[0]);
                num2 = Integer.parseInt(elements[2]);
            } catch (RuntimeException exception) {
                hasException = true;
                throw new RuntimeException(integerNumError);
            }

            checkPositiveNum(num1);
            checkPositiveNum(num2);

            operation = elements[1];
            return switch (operation) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> (double) num1 / num2;
                case "%" -> num1 % num2;
                case "^" -> Math.pow(num1, num2);
                default -> {
                    hasException = true;
                    throw operationError;
                }
            };
        }
    }

    private static void checkPositiveNum(int num) {
        RuntimeException positiveNumError = new RuntimeException("Ошибка: один либо оба члена выражения не являются " +
                "положительными числами");
        if (num <= 0) {
            hasException = true;
            throw positiveNumError;
        }
    }
}