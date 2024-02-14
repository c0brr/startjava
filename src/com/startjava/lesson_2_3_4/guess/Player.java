package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {
    private final int[] enteredNums = new int[10];
    private final String name;
    private int attempts;
    private int roundsWon;

    public Player(String name) {
        this.name = name;
    }

    public int getEnteredNum() {
        return enteredNums[attempts - 1];
    }

    public String getName() {
        return name;
    }

    public void setAttemptsToZero() {
        attempts = 0;
    }

    public int getAttempts() {
        return attempts;
    }

    public void incrementRoundsWon() {
        roundsWon++;
    }

    public int getRoundsWon() {
        return roundsWon;
    }

    public boolean addEnteredNum(int num) {
        if (num < 1 || num > 100) {
            System.out.println("Введенное вами число выходит за рамки дозволенного интервала. Попробуйте еще раз: ");
            return false;
        }
        enteredNums[attempts++] = num;
        return true;
    }

    public int[] getAllNums() {
        return Arrays.copyOf(enteredNums, attempts);
    }

    public void clearEnteredNums() {
        Arrays.fill(enteredNums, 0, attempts, 0);
    }
}