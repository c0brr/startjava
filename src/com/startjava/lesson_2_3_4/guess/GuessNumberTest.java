package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Arrays;

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
                // Вывод введенных игроками чисел
                printInputedNums(game.getFirstPlayer(), Arrays.copyOf(game.getFirstPlayer().getInputedNums(),
                        (10 - game.getFirstPlayer().getAmountAttempts())));
                printInputedNums(game.getSecondPlayer(), Arrays.copyOf(game.getSecondPlayer().getInputedNums(),
                        (10 - game.getSecondPlayer().getAmountAttempts())));
                System.out.println("\n");
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }

    private static void printInputedNums(Player player, int[] copyInputedNums) {
        System.out.print("\nЧисла, введенные игроком " + player.getName() + ": ");
        for (int inputedNum : copyInputedNums) {
            System.out.print(inputedNum + " ");
        }
    }
}