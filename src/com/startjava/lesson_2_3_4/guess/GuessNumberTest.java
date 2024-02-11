package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"\n");
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        String answer = "yes";

        while (!answer.equals("no")) {
            if(answer.equals("yes")) {
                System.out.println("\nИгра началась! У каждого игрока по 10 попыток.");
                GuessNumber game = new GuessNumber(name1, name2);
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }
}