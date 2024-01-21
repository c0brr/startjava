public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int startSegment = -10;
        int endSegment = 21;
        int segmentCounter = startSegment;
        do {
            if (segmentCounter % 2 == 0) {
                sumEven += segmentCounter;
            } else {
                sumOdd += segmentCounter;
            }
            segmentCounter++;
        } while (segmentCounter <= endSegment);
        System.out.println("В отрезке [" + startSegment + ", " + endSegment + "] сумма четных чисел = " + 
                sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else if (num3 >= num1 && num3 >= num2) {
            max = num3;
        }
        if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else if (num3 <= num1 && num3 <= num2) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num1_234 = 1_234;
        int sumDigits = 0;
        System.out.println("Реверсивное число:");
        while (num1_234 != 0) {
            int lastDigit = num1_234 % 10;
            sumDigits += lastDigit;
            System.out.print(lastDigit);
            num1_234 /= 10;
        }
        System.out.println("\n\nСумма его цифр:\n" + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int countOdds = 0;
        int halfIntervalEnd = 24;
        for (int i = 1; i < halfIntervalEnd; i += 2) {
            if (i < 11) {
                System.out.printf("%2d ", i);
            } else {
                System.out.printf("%1d ", i);
            }
            countOdds++;
            if (countOdds % 5 == 0) {
                System.out.println();
            }
        }
        for (int i = halfIntervalEnd - 1; i % 10 != 9; i += 2) {
            System.out.printf("%2d ", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int num3_242_592 = 3_242_592;
        int copyNum = num3_242_592;
        int countTwos = 0;
        while (num3_242_592 > 0) {
            if (num3_242_592 % 10 == 2) {
                countTwos++;
            }
            num3_242_592 /= 10;
        }
        System.out.println(countTwos % 2 == 0 ? 
                "В " + copyNum + " четное количество двоек - " + countTwos : 
                "В " + copyNum + " нечетное количество двоек - " + countTwos);

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        int rightTriangleLines = 5;
        int rightTriangleSymbols = 1;
        while (rightTriangleLines >= rightTriangleSymbols ) {
            while (rightTriangleSymbols <= rightTriangleLines) {
                System.out.print('#');
                rightTriangleSymbols++;
            }
            rightTriangleLines--;
            rightTriangleSymbols = 1;
            System.out.println();
        }
        System.out.println();

        int triangleLines = 1;
        int triangleSymbols = triangleLines;
        int triangleCounter = triangleLines;
        do {
            do {
                triangleSymbols++;
                System.out.print('$');
            } while (triangleSymbols <= triangleCounter);
            if (triangleLines < 3) {
                triangleCounter++;
            } else {
                triangleCounter--;
            }
            System.out.println();
            triangleSymbols = 1;
            triangleLines++;
        } while (triangleLines <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                System.out.printf("%s", "DECIMAL");
            } else if (i == 2) {
                System.out.printf("%13s", "CHARACTER");
            } else {
                System.out.printf("%15s\n", "DESCRIPTION");
            }
        }
        for (int i = 15; i <= 47; i += 2) {
            System.out.printf("%4d%12c%s%s\n", i, (char) i, "             ", Character.getName(i));
        }
        for (int i = 98; i <= 122; i += 2) {
            if (i < 100) {
                System.out.printf("%4d%12c%s%s\n", i, (char) i, "             ", Character.getName(i));
            } else {
                System.out.printf("%5d%11c%s%s\n", i, (char) i, "             ", Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num1_234_321 = 1_234_321;
        System.out.print("Число " + num1_234_321);
        int divider = 1_000_000;
        for (int i = 1; i <= 3; i++) {
            if (num1_234_321 % 10 == num1_234_321 / divider) {
                num1_234_321 = num1_234_321 % divider / 10;
                divider /= 100;
                if (num1_234_321 > 99) {
                    continue;
                } else {
                    System.out.print(" является палиндромом\n");
                }
            } else {
                System.out.print(" не является палиндромом\n");
                break;
            }
        }


        System.out.println("\n9. Проверка, является ли число счастливым");
        int anySixDigitNumber = 613_333;
        int copyAnySixDigitNumber = anySixDigitNumber;
        System.out.print("Число " + anySixDigitNumber);
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 1; i <= 6; i++) {
            if (i > 3) {
                firstHalfSum += anySixDigitNumber % 10;
            } else {
                secondHalfSum += anySixDigitNumber % 10;
            }
            anySixDigitNumber /= 10;
        }
        System.out.print(firstHalfSum == secondHalfSum ? " является счастливым\n" : 
                " не является счастливым\n");
        System.out.println("Сумма цифр " + copyAnySixDigitNumber / 1000 + " = " + firstHalfSum + 
                ", а сумма " + copyAnySixDigitNumber % 1000 + " = " + secondHalfSum);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.printf("%13s%10s\n", "ТАБЛИЦА", "ПИФАГОРА");
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("    ");
                } else if (j == 1) {
                    System.out.print('|');
                } else if (i == 1) {
                    System.out.printf("%c%c%c%c", '-', '-', '-', '-');
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