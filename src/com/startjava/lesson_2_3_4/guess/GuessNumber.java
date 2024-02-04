package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        Random random = new Random();
        secretNum = random.nextInt(1, 101);
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Попытка первого игрока
            System.out.println("\nПопытка игрока " + player1.getName() + ": ");
            player1.setNum(scanner.nextInt());
            if (player1.getNum() == secretNum) {
                System.out.println("\nИгра окончена. " + player1.getName() + " победил!\n");
                return;
            }
            System.out.print("Число " + player1.getNum());
            System.out.print(player1.getNum() > secretNum ? " больше " : " меньше ");
            System.out.println("того, что загадал компьютер.");

            // Попытка второго игрока
            System.out.println("\nПопытка игрока " + player2.getName() + ": ");
            player2.setNum(scanner.nextInt());
            if (player2.getNum() == secretNum) {
                System.out.println("\nИгра окончена. " + player2.getName() + " победил!\n");
                return;
            }
            System.out.print("Число " + player2.getNum());
            System.out.print(player2.getNum() > secretNum ? " больше " : " меньше ");
            System.out.println("того, что загадал компьютер.");
        }
    }
}