import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Угадай число\"\n");
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя втрого игрока: ");
        Player player2 = new Player(scanner.nextLine());

        Random random = new Random();
        String answer = "yes";
        while (answer.equals("yes")) {
            GuessNumber guessNumber = new GuessNumber(player1, player2, random.nextInt(1, 101));
            System.out.println("\nКомпьютер загадал число. Игра начинается...");
            guessNumber.playGame();

            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
        scanner.close();
    }
}