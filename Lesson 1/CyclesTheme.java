public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int counterNum = -10;
        do {
            if (counterNum % 2 == 0) {
                sumEven += counterNum;
            } else {
                sumOdd += counterNum;
            }
            counterNum++;
        } while (counterNum <= 21);
        System.out.println("В отрезке [" + 10 + ", " + -21 + "] сумма четных чисел = " + 
                sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int numMax = 0;
        int numMin = 0;
        if (num1 >= num2 && num1 >= num3) {
            numMax = num1;
            if (num2 <= num3) {
                numMin = num2;
            } else {
                numMin = num3;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            numMax = num2;
            if (num1 <= num3) {
                numMin = num1;
            } else {
                numMin = num3;
            }
        } else if (num3 >= num1 && num3 >= num2) {
            numMax = num3;
            if (num1 <= num2) {
                numMin = num1;
            } else {
                numMin = num2;
            }
        }
        for (int i = numMax - 1; i > numMin; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num4 = 1_234;
        int digitsSum = 0;
        System.out.println("Реверсивное число:");
        while (num4 != 0) {
            digitsSum += num4 % 10;
            System.out.print(num4 % 10);
            num4 /= 10;
        }
        System.out.println("\n\nСумма его цифр:\n" + digitsSum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int counter1 = 0;
        for (int i = 1; i < 24; i += 2) {
            if (i < 11) {
                System.out.printf("%2d ", i);
            } else {
                System.out.printf("%1d ", i);
            }
            counter1++;
            if (counter1 % 5 == 0) {
                System.out.println();
            }
        }
        for (int i = 23; i % 10 != 9; i += 2) {
            System.out.printf("%2d ", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int num5 = 3_242_592;
        int num6 = num5;
        int counter2 = 0;
        while (num5 / 10 != 0) {
            if (num5 % 10 == 2) {
                counter2++;
            }
            num5 /= 10;
        }
        System.out.println(counter2 % 2 == 0 ? "В " + num6 + " четное количество двоек - " + counter2 
                : "В " + num6 + " нечетное количество двоек - " + counter2);

        System.out.println("\n6. Отображение геометрических фигур");
        char aterisk = '*';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(aterisk);
            }
            System.out.println();
        }
        System.out.println();

        char number = '#';
        int counter3 = 5;
        int counter4 = 1;
        while (counter3 >= counter4 ) {
            while (counter4 <= counter3) {
                System.out.print(number);
                counter4++;
            }
            counter3--;
            counter4 = 1;
            System.out.println();
        }
        System.out.println();

        char dollar = '$';
        int counter5 = 1;
        int counter6 = counter5;
        int counter7 = counter5;
        do {
            do {
            counter7++;
            System.out.print(dollar);
            } while (counter7 <= counter6);
        if (counter5 < 3) {
            counter6++;
        } else {
            counter6--;
        }
        System.out.println();
        counter7 = 1;
        counter5++;
        } while(counter5 <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        for (int i = 1; i == 1; i++) {
            System.out.printf("%s%13s%15s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        }
        char symbol;
        for (int i = 15; i <= 47; i += 2) {
            symbol = (char) i;
            System.out.printf("%4d%12c%s%s\n", i, symbol, "             ", Character.getName(i));
        }
        for (int i = 98; i <= 122; i += 2) {
            symbol = (char) i;
            if (i < 100) {
                System.out.printf("%4d%12c%s%s\n", i, symbol, "             ", Character.getName(i));
            } else {
                System.out.printf("%5d%11c%s%s\n", i, symbol, "             ", Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num7 = 1_234_321;
        System.out.print("Число " + num7);
        int counter8 = 0;
        for (int i = num7; i != 0; i /= 10) {
            counter8++;
        }
        int multiplier1 = 10;
        for (int i = 1; i < counter8 - 1; i++) {
            multiplier1 *=10;
        }
        for (int i = 2; i <= counter8 - 1; i += 2) {
            if (num7 % 10 == num7 / multiplier1) {
                num7 = num7 % multiplier1 / 10;
                if (num7 / 10 == 0) {
                    System.out.print(" является палиндромом\n");
                } else {
                    multiplier1 /= 100;
                    continue;
                }
            } else {
                System.out.print(" не является палиндромом\n");
                break;
            }
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int num8 = 613_333;
        int num9 = num8;
        System.out.print("Число " + num8);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= 6; i++) {
            if (i > 3) {
                sum1 += num8 % 10;
            } else {
                sum2 += num8 % 10;
            }
            num8 /= 10;
        }
        System.out.print(sum1 == sum2 ? " является счастливым\n" : " не является счастливым\n");
        System.out.println("Сумма цифр " + num9 / 1000 + " = " + sum1 + 
                ", а сумма " + num9 % 1000 + " = " + sum2);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.printf("%13s%10s\n", "ТАБЛИЦА", "ПИФАГОРА");
        char verticalBar = '|';
        char minus = '-';
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("    ");
                } else if (j == 1) {
                    System.out.print(verticalBar);
                } else if (i == 1) {
                    System.out.printf("%c%c%c%c", minus, minus, minus, minus);
                } else if (i == 0) {
                    System.out.printf("%3d ", (i + 1) * j);
                } else if (j == 0) {
                    System.out.printf("%3d ", i * (j + 1));
                } else {
                    System.out.printf("%3d ", i * j);
                }
            }
            System.out.println();
        }
    }
}