package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {
    private static final int MIN_ACCEPTBLE_NUM = 1;
    private static final int MAX_ACCEPTBLE_NUM = 100;
    private final int[] enteredNums = new int[10];
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
        if (num < MIN_ACCEPTBLE_NUM || num > MAX_ACCEPTBLE_NUM) {
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