package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNum;

    public GuessNumber(String firstPlayerName, String secondPlayerName) {
        Random random = new Random();
        secretNum = random.nextInt(1, 101);
        firstPlayer = new Player(firstPlayerName);
        secondPlayer = new Player(secondPlayerName);
    }

    public void play() {
        System.out.println("\nИгра началась! У каждого игрока по 10 попыток.");
        int[] copyFirstPlayerInputedNums = new int[0];
        int[] copySecondPlayerInputedNums = new int[0];
        for (int i = 0; secondPlayer.getAmountAttempts() != 0; i++) {
            // Попытка первого игрока
            tryGuess(firstPlayer, i);
            copySecondPlayerInputedNums = Arrays.copyOf(firstPlayer.getInputedNums(), i + 1);
            if (firstPlayer.getNum() == secretNum) {
                break;
            }

            // Попытка второго игрока
            tryGuess(secondPlayer, i);
            copySecondPlayerInputedNums = Arrays.copyOf(secondPlayer.getInputedNums(), i + 1);
            if (secondPlayer.getNum() == secretNum) {
                break;
            }
        }

        // Вывод введенных игроками чисел
        printInputedNums(firstPlayer, copyFirstPlayerInputedNums);
        printInputedNums(secondPlayer, copySecondPlayerInputedNums);
        System.out.println("\n");
    }

    private void tryGuess(Player player, int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nПопытка игрока " + player.getName() + ": ");
        player.setNum(scanner.nextInt());
        player.getInputedNums()[index] = player.getNum();
        player.setAmountAttempts(player.getAmountAttempts() - 1);
        if (player.getNum() == secretNum) {
            System.out.println("\nИгрок " + player.getName() + " угадал " + secretNum + " с " +
                    (10 - player.getAmountAttempts()) + " попытки\n");
            return;
        }
        System.out.print("Число " + player.getNum());
        System.out.print(player.getNum() > secretNum ? " больше " : " меньше ");
        System.out.println("того, что загадал компьютер.");
        if (player.getAmountAttempts() == 0) {
            System.out.println("У " + player.getName() + " закончились попытки");
        } else {
            System.out.println("У " + player.getName() + " осталось " + player.getAmountAttempts() + " попыток");
        }
    }

    private void printInputedNums(Player player, int[] copyInputedNums) {
        System.out.print("\nЧисла, введенные игроком " + player.getName() + ": ");
        for (int inputedNum : copyInputedNums) {
            System.out.print(inputedNum + " ");
        }
    }
}