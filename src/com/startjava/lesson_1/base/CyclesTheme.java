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
        if (num2 > num1) {
            max = num2;
        } else if (num2 < num1) {
            min = num2;
        }
        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int originNum = 1_234;
        int sumDigits = 0;
        System.out.println("Реверсивное число:");
        while (originNum > 0) {
            int lastDigit = originNum % 10;
            sumDigits += lastDigit;
            System.out.print(lastDigit);
            originNum /= 10;
        }
        System.out.println("\n\nСумма его цифр:\n" + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        endSegment = 24;
        int amountNumsLine = 0;
        for (int i = 1; i < endSegment; i += 2) {
            System.out.printf("%2d ", i);
            amountNumsLine++;
            if (amountNumsLine == 5) {
                System.out.println();
                amountNumsLine = 0;
            }
        }
        for (int i = endSegment - 1; i % 10 != 9; i += 2) {
            System.out.printf("%2d ", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        originNum = 3_242_592;
        int copyOriginNum = originNum;
        int countTwos = 0;
        while (originNum > 0) {
            if (originNum % 10 == 2) {
                countTwos++;
            }
            originNum /= 10;
        }
        System.out.print("В " + copyOriginNum);
        System.out.print(countTwos % 2 == 0 ? " четное " : " нечетное ");
        System.out.println("количество двоек - " + countTwos);

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        int figureLines = 5;
        int figureSymbols = 1;
        while (figureLines >= figureSymbols ) {
            while (figureSymbols <= figureLines) {
                System.out.print('#');
                figureSymbols++;
            }
            figureLines--;
            figureSymbols = 1;
            System.out.println();
        }
        System.out.println();

        figureLines = 1;
        figureSymbols = figureLines;
        int counter = figureLines;
        do {
            do {
                figureSymbols++;
                System.out.print('$');
            } while (figureSymbols <= counter);
            if (figureLines < 3) {
                counter++;
            } else {
                counter--;
            }
            System.out.println();
            figureSymbols = 1;
            figureLines++;
        } while (figureLines <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%s%13s%15s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i <= 47; i += 2) {
            System.out.printf("%4d%12c%s%s\n", i, i, "             ", Character.getName(i));
        }
        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("%4d%12c%s%s\n", i, i, "             ", Character.getName(i));
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        originNum = 1_234_321;
        copyOriginNum = originNum;
        int reverseNum = 0;
        for ( ; copyOriginNum > 0; copyOriginNum /= 10) {
            reverseNum = reverseNum * 10 + copyOriginNum % 10;
        }
        System.out.print("Число " + originNum);
        System.out.print(reverseNum == originNum ? " является " : " не является ");
        System.out.println("палиндромом");

        System.out.println("\n9. Проверка, является ли число счастливым");
        originNum = 613_333;
        copyOriginNum = originNum;
        System.out.print("Число " + originNum);
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        for (int i = 1; i <= 6; i++) {
            if (i > 3) {
                sumLeftHalf += originNum % 10;
            } else {
                sumRightHalf += originNum % 10;
            }
            originNum /= 10;
        }
        System.out.print(sumLeftHalf == sumRightHalf ? " является счастливым\n" : 
                " не является счастливым\n");
        System.out.println("Сумма цифр " + copyOriginNum / 1000 + " = " + sumLeftHalf + 
                ", а сумма " + copyOriginNum % 1000 + " = " + sumRightHalf);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.printf("%12s%10s\n", "ТАБЛИЦА", "ПИФАГОРА");
        System.out.println("    |  2   3   4   5   6   7   8   9");
        System.out.println("----+-------------------------------");
        for (int i = 2; i <= 9; i++) {
           for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    System.out.printf("%3d ", i);
                } else if (j == 1) {
                    System.out.print('|');
                } else {
                    System.out.printf("%3d ", i * j);
                }
            }
            System.out.println();
        }
    }
}