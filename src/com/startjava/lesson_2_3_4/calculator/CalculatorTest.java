package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";
        String question = "Хотите продолжить вычисления? [yes/no]: ";

        while (true) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                calculator.calculate(scanner.nextLine());
                System.out.print(question);
                answer = scanner.nextLine();
            } else if (answer.equals("no")) {
                break;
            } else {
                System.out.print(question);
                answer = scanner.nextLine();
            }
        }
        scanner.close();
    }
}