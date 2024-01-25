import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        Random random = new Random();
        int computerNum = random.nextInt(1, 101);
        int myNum = 12;
        while (myNum != computerNum) {
            if (myNum > computerNum) {
                System.out.println("Число " + myNum + " больше того, что загадал компьютер");
                myNum -= 4;
            }
            if (myNum < computerNum) {
                System.out.println("Число " + myNum + " меньше того, что загадал компьютер");
                myNum += 15;
            }
        }
        System.out.println("Вы победили!");
    }
}