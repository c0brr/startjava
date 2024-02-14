package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private final static Player[] PLAYERS = new Player[3];
    private final static Random RANDOM = new Random();
    private final static Scanner SCANNER = new Scanner(System.in);
    private int secretNum;
    private boolean isSecretNumGuessed;

    public GuessNumber(String name1, String name2, String name3) {
        PLAYERS[0] = new Player(name1);
        PLAYERS[1] = new Player(name2);
        PLAYERS[2] = new Player(name3);
    }

    public void play() {
        drawPlayers();
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " раунд. У каждого игрока по 10 попыток.");
            secretNum = RANDOM.nextInt(1, 101);
            for (int j = 0; j < 10 && !isSecretNumGuessed; j++) {
                setSecretNumGuessed(tryGuess(PLAYERS[0]));
                if (!isSecretNumGuessed) {
                    setSecretNumGuessed(tryGuess(PLAYERS[1]));
                }
                if (!isSecretNumGuessed) {
                    setSecretNumGuessed(tryGuess(PLAYERS[2]));
                }
            }

            for (Player player : PLAYERS) {
                printEnteredNums(player.getName(), player.getAllNums());
                player.clearEnteredNums();
                player.setAttemptsToZero();
            }
            isSecretNumGuessed = false;

            System.out.println("\n");
        }

        System.out.print("По итогам 3 раундов ");
        if (PLAYERS[0].getRoundsWon() > PLAYERS[1].getRoundsWon() &&
                PLAYERS[0].getRoundsWon() > PLAYERS[2].getRoundsWon()) {
            System.out.print("победил " + PLAYERS[0].getName());
        } else if (PLAYERS[1].getRoundsWon() > PLAYERS[0].getRoundsWon() &&
                PLAYERS[1].getRoundsWon() > PLAYERS[2].getRoundsWon()) {
            System.out.print("победил " + PLAYERS[1].getName());
        } else if (PLAYERS[2].getRoundsWon() > PLAYERS[0].getRoundsWon() &&
                PLAYERS[2].getRoundsWon() > PLAYERS[1].getRoundsWon()) {
            System.out.print("победил " + PLAYERS[2].getName());
        } else {
            System.out.print("победитель не выявлен");
        }
        System.out.println("\n");
    }

    private void drawPlayers() {
        System.out.println("Жеребьевка...");
        Player player;
        for (int i = PLAYERS.length; i > 0; i--) {
            int index = RANDOM.nextInt(i);
            player = PLAYERS[index];
            PLAYERS[index] = PLAYERS[i - 1];
            PLAYERS[i - 1] = player;
        }
        System.out.println("Игроки угадывают числа в порядке следующей очереди: " +
                PLAYERS[0].getName() + ", " + PLAYERS[1].getName() + ", " + PLAYERS[2].getName() + ".");
    }

    private boolean tryGuess(Player player) {
        boolean isNumAcceptble = false;
        System.out.println("\nПопытка игрока " + player.getName() + ": ");
        while (!isNumAcceptble) {
            isNumAcceptble = player.addEnteredNum(SCANNER.nextInt());
        }
        if (player.getEnteredNum() == secretNum) {
            System.out.println("\nИгрок " + player.getName() + " угадал " +
                    secretNum + " с " + player.getAttempts() + " попытки");
            player.incrementRoundsWon();
            return true;
        }
        System.out.print("Число " + player.getEnteredNum());
        System.out.print(player.getEnteredNum() > secretNum ? " больше " : " меньше ");
        System.out.println("того, что загадал компьютер.");
        if (player.getAttempts() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void setSecretNumGuessed(boolean isSecretNumGuessed) {
        this.isSecretNumGuessed = isSecretNumGuessed;
    }

    private void printEnteredNums(String name, int[] enteredNums) {
        System.out.print("\nИгрок " + name + " ввел числа: ");
        for (int num : enteredNums ) {
            System.out.print(num + " ");
        }
    }
}