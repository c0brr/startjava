import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        Random random = new Random();
        int computerNum = random.nextInt(1, 101);
        int playerNum = 12;
        while (playerNum != computerNum) {
            if (playerNum > computerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum -= 4;
            }
            if (playerNum < computerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum += 15;
            }
        }
        System.out.println("Вы победили!");
    }
}