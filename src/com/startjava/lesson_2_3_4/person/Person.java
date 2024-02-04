package com.startjava.lesson_2_3_4.person;

public class Person {
    String gender = "Male";
    String name = "Mike";
    double height = 1.86;
    int weight = 79;
    int age = 27;

    void walk() {
        System.out.println(name + " is walking...");
    }

    void sit() {
        System.out.println(name + " is sitting...");
    }

    void run() {
        System.out.println(name + " is running...");
    }

    void talk() {
        System.out.println(name + " is talking...");
    }

    void learnJava() {
        System.out.println(name + " learns Java.");
    }
}