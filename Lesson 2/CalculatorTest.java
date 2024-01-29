import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.println("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());
            calculator.calculate();
            scanner.nextLine();

            answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
        }
        scanner.close();
    }
}