package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"\n");
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Ведите имя " + (i + 1) + " игрока: ");
            names[i] = scanner.nextLine();
        }
        String answer = "yes";

        while (!answer.equals("no")) {
            if(answer.equals("yes")) {
                System.out.println("\nИгра началась!");
                GuessNumber game = new GuessNumber(names);
                game.drawPlayers();
                game.play();
                game.printWinner();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }
}