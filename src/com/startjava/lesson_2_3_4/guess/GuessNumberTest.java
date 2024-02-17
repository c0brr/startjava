package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\"\n");
        String[] names = new String[GuessNumber.AMOUNT_PLAYERS];
        inputNames(names);
        String answer = "yes";

        while (!answer.equals("no")) {
            if(answer.equals("yes")) {
                System.out.println("\nИгра началась!");
                GuessNumber game = new GuessNumber(names);
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }

    private static void inputNames(String[] names) {
        for (int i = 0; i < GuessNumber.AMOUNT_PLAYERS; i++) {
            System.out.println("Ведите имя " + (i + 1) + " игрока: ");
            names[i] = scanner.nextLine();
        }
    }
}