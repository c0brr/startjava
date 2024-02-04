package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Женский");
        wolf.setName("Алиса");
        wolf.setColor("Серо-коричневый");
        wolf.setWeight(56.8);
        wolf.setAge(8);

        System.out.println("Волк" + 
                "\nПол: " + wolf.getGender() + 
                "\nКличка: " + wolf.getName() + 
                "\nОкрас: " + wolf.getColor() + 
                "\nВес, кг: " + wolf.getWeight() + 
                "\nВозраст, лет: " + wolf.getAge());
        System.out.println();

        wolf.run();
        wolf.walk();
        wolf.howl();
        wolf.sit();
        wolf.hunt();
    }
}