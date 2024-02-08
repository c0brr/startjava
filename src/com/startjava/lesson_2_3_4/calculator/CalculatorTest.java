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
                    double result = Calculator.calculate(scanner.nextLine());
                    Calculator.printResult(result);
                } catch (RuntimeException exception) {
                    System.out.println(exception);
                }
                Calculator.setHasException(false);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }
}