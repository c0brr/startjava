package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

class Player {
    private String name;
    private int[] enteredNums = new int[10];
    private int attemptsCounter;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNum(int index, int num) {
        enteredNums[index] = num;
    }

    public int getEnteredNum(int index) {
        return enteredNums[index];
    }

    public void setAttemptsCounter(int attemptsCounter) {
        this.attemptsCounter = attemptsCounter;
    }

    public int[] getEnteredNumsCopy() {
        return Arrays.copyOf(enteredNums, attemptsCounter + 1);
    }

    public void clearEnteredNums() {
        Arrays.fill(enteredNums, 0, attemptsCounter + 1, 0);
    }
}