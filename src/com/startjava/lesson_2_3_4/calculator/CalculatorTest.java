package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                try {
                    System.out.print("Введите математическое выражение: ");
                    String mathExpression = scanner.nextLine();
                    double result = Calculator.calculate(mathExpression);
                    printResult(mathExpression, result);
                } catch (RuntimeException exception) {
                    System.out.println(exception.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }

    private static void printResult(String mathExpression, double result) {
        System.out.print(mathExpression + " = ");
        System.out.print(result - (int) result == 0 ? (int) result + "\n" : String.format("%.3f\n", result));
    }
}