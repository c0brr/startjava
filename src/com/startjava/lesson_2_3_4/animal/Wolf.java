package com.startjava.lesson_2_3_4.animal;

class Wolf {
    private String gender;
    private String name;
    private String color;
    private double weight;
    private int age;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст\n");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void walk() {
        System.out.println(name + " идет...");
    }

    public void sit() {
        System.out.println(name + " сидит...");
    }

    public void run() {
        System.out.println(name + " бежит...");
    }

    public void howl() {
        System.out.println(name + " воет...");
    }

    public void hunt() {
        System.out.println(name + " охотится...");
    }
}