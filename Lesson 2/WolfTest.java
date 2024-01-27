public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Женский";
        wolf.name = "Алиса";
        wolf.color = "Серо-коричневый";
        wolf.weight = 56.8;
        wolf.age = 8;

        System.out.println("Волк" + 
        "\nПол: " + wolf.gender + 
        "\nКличка: " + wolf.name + 
        "\nОкрас: " + wolf.color + 
        "\nВес, кг: " + wolf.weight + 
        "\nВозраст, лет: " + wolf.age);
        System.out.println();

        wolf.run();
        wolf.walk();
        wolf.howl();
        wolf.sit();
        wolf.hunt();
    }
}