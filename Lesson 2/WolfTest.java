class Wolf {
    String gender;
    String name;
    String color;
    double weight;
    int age;

    void walk() {
        System.out.println(name + " идет...");
    }

    void sit() {
        System.out.println(name + " сидит...");
    }

    void run() {
        System.out.println(name + " бежит...");
    }

    void howl() {
        System.out.println(name + " воет...");
    }

    void hunt() {
        System.out.println(name + " охотится...");
    }

    void getWolfInfo() {
        System.out.println("Волк" + 
                "\nПол: " + gender + 
                "\nКличка: " + name + 
                "\nОкрас: " + color + 
                "\nВес, кг: " + weight + 
                "\nВозраст, лет: " + age);
    }
}

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Женский";
        wolf.name = "Алиса";
        wolf.color = "Серо-коричневый";
        wolf.weight = 56.8;
        wolf.age = 8;

        wolf.getWolfInfo();
        System.out.println();

        wolf.run();
        wolf.walk();
        wolf.howl();
        wolf.sit();
        wolf.hunt();
    }
}