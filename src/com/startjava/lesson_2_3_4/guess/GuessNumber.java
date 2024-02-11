package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;
    private boolean isSecretNumGuessed;

    public GuessNumber(String name1, String name2) {
        Random random = new Random();
        secretNum = random.nextInt(1, 101);
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void play() {
        for (int i = 0; i < 10 && !isSecretNumGuessed; i++) {
            System.out.println("\nПопытка игрока " + player1.getName() + ": ");
            tryGuess(player1, i);
            if (!isSecretNumGuessed) {
                System.out.println("\nПопытка игрока " + player2.getName() + ": ");
                tryGuess(player2, i);
            }
        }

        System.out.print("\nИгрок " + player1.getName() + " ввел числа: ");
        printInputedNums(player1.getEnteredNumsCopy());
        System.out.print("\nИгрок " + player2.getName() + " ввел числа: ");
        printInputedNums(player2.getEnteredNumsCopy());

        player1.clearEnteredNums();
        player2.clearEnteredNums();
        System.out.println("\n");
    }

    private void tryGuess(Player player, int index) {
        Scanner scanner = new Scanner(System.in);
        player.setEnteredNum(index, scanner.nextInt());
        player.setAttemptsCounter(index);
        if (player.getEnteredNum(index) == secretNum) {
            System.out.println("\nИгрок " + player.getName() + " угадал " +
                    secretNum + " с " + (index + 1) + " попытки\n");
            isSecretNumGuessed = true;
            return;
        }
        System.out.print("Число " + player.getEnteredNum(index));
        System.out.print(player.getEnteredNum(index) > secretNum ? " больше " : " меньше ");
        System.out.println("того, что загадал компьютер.");
        if (index == 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void printInputedNums(int[] enteredNumsCopy) {
        for (int num : enteredNumsCopy ) {
            System.out.print(num + " ");
        }
    }
}