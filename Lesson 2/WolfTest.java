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