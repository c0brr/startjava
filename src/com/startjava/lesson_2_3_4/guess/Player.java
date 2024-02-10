package com.startjava.lesson_2_3_4.guess;

class Player {
    private String name;
    private int num;
    private int[] inputedNums = new int[10];
    private int amountAttempts = 10;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int[] getInputedNums() {
        return inputedNums;
    }

    public void setAmountAttempts(int amountAttempts) {
        this.amountAttempts = amountAttempts;
    }

    public int getAmountAttempts() {
        return amountAttempts;
    }

    public void fillInputedNums(int index) {
        inputedNums[index] = num;
    }
}