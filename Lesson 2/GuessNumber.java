import java.util.Scanner;

class GuessNumber {
    private int computerNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2, int computerNum) {
        this.player1 = player1;
        this.player2 = player2;
        this.computerNum = computerNum;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Попытка первого игрока
            System.out.println("\nПопытка игрока " + player1.getName() + ": ");
            player1.setNum(scanner.nextInt());
            if (player1.getNum() == computerNum) {
                System.out.println("\nИгра окончена. " + player1.getName() + " победил!\n");
                return;
            } else {
                System.out.print("Число " + player1.getNum());
                System.out.print(player1.getNum() > computerNum ? " больше " : " меньше ");
                System.out.println("того, что загадал компьютер.");
            }

            // Попытка второго игрока
            System.out.println("\nПопытка игрока " + player2.getName() + ": ");
            player2.setNum(scanner.nextInt());
            if (player2.getNum() == computerNum) {
                System.out.println("\nИгра окончена. " + player2.getName() + " победил!\n");
                return;
            } else {
                System.out.print("Число " + player2.getNum());
                System.out.print(player2.getNum() > computerNum ? " больше " : " меньше ");
                System.out.println("того, что загадал компьютер.");
            }
        }
    }
}