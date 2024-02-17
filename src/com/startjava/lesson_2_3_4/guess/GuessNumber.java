package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    public static final int AMOUNT_PLAYERS = 3;
    public static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUNDS = 3;
    private final Player[] players = new Player[AMOUNT_PLAYERS];
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private int secretNum;
    private boolean isSecretNumGuessed;

    public GuessNumber(String[] names) {
        for (int i = 0; i < AMOUNT_PLAYERS; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void play() {
        drawPlayers();
        for (int i = 1; i <= MAX_ROUNDS; i++) {
            System.out.println(i + " раунд. У каждого игрока по 10 попыток.");
            secretNum = random.nextInt(Player.BOTTOM_BOUND, Player.UPPER_BOUND + 1);
            for (int j = 0; j < MAX_ATTEMPTS && !isSecretNumGuessed; j++) {
                for (Player player : players) {
                    inputNum(player);
                    isSecretNumGuessed = isGuessed(player);
                    if (isSecretNumGuessed) {
                        break;
                    }
                    checkAmountAttempts(player);
                }
            }

            for (Player player : players) {
                printEnteredNums(player.getName(), player.getAllNums());
                player.clear();
            }
            isSecretNumGuessed = false;

            System.out.println("\n");
        }
        printWinner();
    }

    private void drawPlayers() {
        System.out.println("Жеребьевка...");
        for (int i = AMOUNT_PLAYERS; i > 0; i--) {
            int index = random.nextInt(i);
            Player player = players[index];
            players[index] = players[i - 1];
            players[i - 1] = player;
        }
        System.out.print("Игроки угадывают числа в порядке следующей очереди: ");
        for (int i = 0; i < AMOUNT_PLAYERS; i++) {
            System.out.print(players[i].getName());
            System.out.print(i == AMOUNT_PLAYERS - 1 ? ".\n" : ", ");
        }
    }

    private void inputNum(Player player) {
        boolean isNumAcceptble = false;
        System.out.println("\nПопытка игрока " + player.getName() + ": ");
        while (!isNumAcceptble) {
            isNumAcceptble = player.addEnteredNum(scanner.nextInt());
        }
    }

    private boolean isGuessed(Player player) {
        int playerNum = player.getEnteredNum();
        if (playerNum == secretNum) {
            System.out.println("\nИгрок " + player.getName() + " угадал " +
                    secretNum + " с " + player.getAttempts() + " попытки");
            player.incrementCountWins();
            return true;
        }
        System.out.print("Число " + playerNum);
        System.out.print(playerNum > secretNum ? " больше " : " меньше ");
        System.out.println("того, что загадал компьютер.");
        return false;
    }

    private void checkAmountAttempts(Player player) {
        if (player.getAttempts() == MAX_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void printEnteredNums(String name, int[] enteredNums) {
        System.out.print("\nИгрок " + name + " ввел числа: ");
        for (int num : enteredNums ) {
            System.out.print(num + " ");
        }
    }

    private void printWinner() {
        System.out.print("По итогам 3 раундов ");
        int countWinners = 0;
        String winner = "";
        for (Player player : players) {
            if (player.getCountWins() > 0) {
                if (player.getCountWins() > 1) {
                    System.out.println("победил " + player.getName() + "\n");
                    return;
                }
                countWinners++;
                winner = player.getName();
            }
        }
        if (countWinners != 1) {
            System.out.println("победитель не выявлен\n");
        } else {
            System.out.println("победил " + winner + "\n");
        }
    }
}