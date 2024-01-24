import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numComputer = random.nextInt(1, 101);
        int numHuman = 12;
        while (numHuman != numComputer) {
            if (numHuman > numComputer) {
                System.out.println("Число " + numHuman + " больше того, что загадал компьютер");
                numHuman -= 4;
            }
            if (numHuman < numComputer) {
                System.out.println("Число " + numHuman + " меньше того, что загадал компьютер");
                numHuman += 15;
            }
        }
        System.out.println("Вы победили!");
    }
}