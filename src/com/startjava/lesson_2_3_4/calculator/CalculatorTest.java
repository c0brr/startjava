package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                calculator.printResult(scanner.nextLine());
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }
}