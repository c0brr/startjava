package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_ATTEMPTS = 10;
    private static final int START_INTERVAL = 1;
    private static final int END_INTERVAL = 101;
    private final Player[] players = new Player[3];
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private int secretNum;
    private boolean isSecretNumGuessed;

    public GuessNumber(String[] names) {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void drawPlayers() {
        System.out.println("Жеребьевка...");
        Player player;
        for (int i = players.length; i > 0; i--) {
            int index = random.nextInt(i);
            player = players[index];
            players[index] = players[i - 1];
            players[i - 1] = player;
        }
        System.out.println("Игроки угадывают числа в порядке следующей очереди: " +
                players[0].getName() + ", " + players[1].getName() + ", " + players[2].getName() + ".");
    }

    public void play() {
        for (int i = 1; i <= MAX_ROUNDS; i++) {
            System.out.println(i + " раунд. У каждого игрока по 10 попыток.");
            secretNum = random.nextInt(START_INTERVAL, END_INTERVAL);
            for (int j = 0; j < MAX_ATTEMPTS && !isSecretNumGuessed; j++) {
                setSecretNumGuessed(tryGuess(players[0]));
                if (!isSecretNumGuessed) {
                    setSecretNumGuessed(tryGuess(players[1]));
                }
                if (!isSecretNumGuessed) {
                    setSecretNumGuessed(tryGuess(players[2]));
                }
            }

            for (Player player : players) {
                printEnteredNums(player.getName(), player.getAllNums());
                player.clear();
            }
            isSecretNumGuessed = false;

            System.out.println("\n");
        }
    }

    public void printWinner() {
        System.out.print("По итогам 3 раундов ");
        int countWinners = 0;
        String winner = "";
        for (Player player : players) {
            if (player.getCountWins() > 0) {
                if (player.getCountWins() > 1) {
                    System.out.print("победил " + player.getName() + "\n\n");
                    return;
                }
                countWinners++;
                winner = player.getName();
            }
        }
        if (countWinners != 1) {
            System.out.print("победитель не выявлен\n\n");
        } else {
            System.out.print("победил " + winner + "\n\n");
        }
    }

    private boolean tryGuess(Player player) {
        boolean isNumAcceptble = false;
        System.out.println("\nПопытка игрока " + player.getName() + ": ");
        while (!isNumAcceptble) {
            isNumAcceptble = player.addEnteredNum(scanner.nextInt());
        }
        if (player.getEnteredNum() == secretNum) {
            System.out.println("\nИгрок " + player.getName() + " угадал " +
                    secretNum + " с " + player.getAttempts() + " попытки");
            player.incrementCountWins();
            return true;
        }
        System.out.print("Число " + player.getEnteredNum());
        System.out.print(player.getEnteredNum() > secretNum ? " больше " : " меньше ");
        System.out.println("того, что загадал компьютер.");
        if (player.getAttempts() == MAX_ATTEMPTS) {
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