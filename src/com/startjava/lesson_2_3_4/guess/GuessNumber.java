package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

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

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public void play() {
        System.out.println("\nИгра началась! У каждого игрока по 10 попыток.");
        for (int i = 0; secondPlayer.getAmountAttempts() != 0; i++) {
            // Попытка первого игрока
            tryGuess(firstPlayer, i);
            if (firstPlayer.getNum() == secretNum) {
                break;
            }

            // Попытка второго игрока
            tryGuess(secondPlayer, i);
            if (secondPlayer.getNum() == secretNum) {
                break;
            }
        }
    }

    private void tryGuess(Player player, int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nПопытка игрока " + player.getName() + ": ");
        player.setNum(scanner.nextInt());
        player.fillInputedNums(index);
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
}