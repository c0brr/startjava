package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        // Создание первого егеря
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Tactit Ronin");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Japan");
        jaeger1.setHeight(74.37f);
        jaeger1.setWeight(7.45f);
        jaeger1.setStrenght(7);
        jaeger1.setArmor(3);
        jaeger1.setMaxSpeed(8);
        jaeger1.setLaunchDate("December 6, 2015");
        jaeger1.setBodyLanguage("Shikon Kobushi (The Fang-Fist Way)");
        jaeger1.setWeapon("Fangblades");
        jaeger1.setKaijuKilled(3);

        // Инфо о первом егере
        System.out.println(jaeger1.getInfo());
        System.out.println();

        // Действия первого егеря
        jaeger1.drift();
        System.out.println("Current speed is " + jaeger1.getCurrentSpeed());
        jaeger1.startMove();
        jaeger1.forceMaxSpeed();
        System.out.println("Current speed is " + jaeger1.getCurrentSpeed());
        while (jaeger1.getCurrentSpeed() > 5) {
            jaeger1.speedDown(1);
            System.out.println("Current speed is " + jaeger1.getCurrentSpeed());
        }
        jaeger1.stopMove();
        System.out.println("Current speed is " + jaeger1.getCurrentSpeed());
        System.out.println(jaeger1.scanKaiju());
        System.out.println("Kaiju was scanned!");
        jaeger1.activateWeapon();
        System.out.println(jaeger1.useWeapon());
        jaeger1.killKaiju();
        jaeger1.deactivateWeapon();
        System.out.println("Kaiju killed by " + jaeger1.getModelName() + ": " + jaeger1.getKaijuKilled());
        System.out.println();

        // Создание второго егеря
        Jaeger jaeger2 = new Jaeger("Horizon Brave", "Mark-1", "China", 72.54f, 7.89f, 4, 6,
                8, "December 22, 2015", "Headstrong brawler", "Cryo-cannon", 2);

        // Инфо о втором егере
        System.out.println(jaeger2.getInfo());
    }
}