package com.startjava.lesson_2_3.guess;

class Player {
    private String name;
    private int num;

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
}