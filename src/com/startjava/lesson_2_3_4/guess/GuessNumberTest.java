package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"\n");
        System.out.println("Введите имя первого игрока: ");
        String firstPlayerName = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String secondPlayerName = scanner.nextLine();
        String answer = "yes";

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                GuessNumber game = new GuessNumber(firstPlayerName, secondPlayerName);
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }
}