package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";

        while (!answer.equals("no")) {
            if (!answer.equals("yes")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                double result = calculator.calculate(scanner.nextLine());
                if (result == Double.MIN_VALUE) {
                    System.out.println("Ошибка: знак " + calculator.getOperation() + " не поддерживается");
                } else {
                    System.out.print(calculator.getNum1() +
                            " " + calculator.getOperation() +
                            " " + calculator.getNum2() + " = ");
                    System.out.print(result - (int) result == 0 ?
                            (int) result + "\n" : String.format("%.3f\n", result));
                }
                answer = "";
            }
        }
        scanner.close();
    }
}