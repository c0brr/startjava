package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {
    public static final int BOTTOM_BOUND = 1;
    public static final int UPPER_BOUND = 100;
    private final int[] enteredNums = new int[GuessNumber.MAX_ATTEMPTS];
    private final String name;
    private int attempts;
    private int countWins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getCountWins() {
        return countWins;
    }

    public void incrementCountWins() {
        countWins++;
    }

    public int getEnteredNum() {
        return enteredNums[attempts - 1];
    }

    public boolean addEnteredNum(int num) {
        if (num < BOTTOM_BOUND || num > UPPER_BOUND) {
            System.out.println("Введенное вами число выходит за рамки дозволенного интервала. Попробуйте еще раз: ");
            return false;
        }
        enteredNums[attempts++] = num;
        return true;
    }

    public int[] getAllNums() {
        return Arrays.copyOf(enteredNums, attempts);
    }

    public void clear() {
        Arrays.fill(enteredNums, 0, attempts, 0);
        attempts = 0;
    }
}