public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int startSegment = -10;
        int endSegment = 21;
        int firstTaskCounter = startSegment;
        do {
            if (firstTaskCounter % 2 == 0) {
                sumEven += firstTaskCounter;
            } else {
                sumOdd += firstTaskCounter;
            }
            firstTaskCounter++;
        } while (firstTaskCounter <= endSegment);
        System.out.println("В отрезке [" + startSegment + ", " + endSegment + "] сумма четных чисел = " + 
                sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int secondTaskNum1 = 10;
        int secondTaskNum2 = 5;
        int secondTaskNum3 = -1;
        int max = secondTaskNum1;
        int min = secondTaskNum1;
        if (secondTaskNum2 >= secondTaskNum1 && secondTaskNum2 >= secondTaskNum3) {
            max = secondTaskNum2;
        } else if (secondTaskNum3 >= secondTaskNum1 && secondTaskNum3 >= secondTaskNum2) {
            max = secondTaskNum3;
        }
        if (secondTaskNum2 <= secondTaskNum1 && secondTaskNum2 <= secondTaskNum3) {
            min = secondTaskNum2;
        } else if (secondTaskNum3 <= secondTaskNum1 && secondTaskNum3 <= secondTaskNum2) {
            min = secondTaskNum3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int thirdTaskNum = 1_234;
        int sumDigits = 0;
        System.out.println("Реверсивное число:");
        while (thirdTaskNum != 0) {
            int lastDigit = thirdTaskNum % 10;
            sumDigits += lastDigit;
            System.out.print(lastDigit);
            thirdTaskNum /= 10;
        }
        System.out.println("\n\nСумма его цифр:\n" + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int fourthTaskCounter = 0;
        int fourthTaskNum = 24;
        for (int i = 1; i < fourthTaskNum; i += 2) {
            if (i < 11) {
                System.out.printf("%2d ", i);
            } else {
                System.out.printf("%1d ", i);
            }
            fourthTaskCounter++;
            if (fourthTaskCounter % 5 == 0) {
                System.out.println();
            }
        }
        for (int i = fourthTaskNum - 1; i % 10 != 9; i += 2) {
            System.out.printf("%2d ", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int fifthTaskNum = 3_242_592;
        int copyNum = fifthTaskNum;
        int countTwos = 0;
        while (fifthTaskNum > 0) {
            if (fifthTaskNum % 10 == 2) {
                countTwos++;
            }
            fifthTaskNum /= 10;
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

        int secondGeometricFigureLines = 5;
        int secondGeometricFigureSymbols = 1;
        while (secondGeometricFigureLines >= secondGeometricFigureSymbols ) {
            while (secondGeometricFigureSymbols <= secondGeometricFigureLines) {
                System.out.print('#');
                secondGeometricFigureSymbols++;
            }
            secondGeometricFigureLines--;
            secondGeometricFigureSymbols = 1;
            System.out.println();
        }
        System.out.println();

        int thirdGeometricFigureLines = 1;
        int thirdGeometricFigureSymbols = thirdGeometricFigureLines;
        int thirdGeometricFigureCounter = thirdGeometricFigureLines;
        do {
            do {
                thirdGeometricFigureSymbols++;
                System.out.print('$');
            } while (thirdGeometricFigureSymbols <= thirdGeometricFigureCounter);
            if (thirdGeometricFigureLines < 3) {
                thirdGeometricFigureCounter++;
            } else {
                thirdGeometricFigureCounter--;
            }
            System.out.println();
            thirdGeometricFigureSymbols = 1;
            thirdGeometricFigureLines++;
        } while (thirdGeometricFigureLines <= 5);

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
        int eighthTaskNum = 1_234_321;
        System.out.print("Число " + eighthTaskNum);
        int divider = 1_000_000;
        for (int i = 1; i <= 3; i++) {
            if (eighthTaskNum % 10 == eighthTaskNum / divider) {
                eighthTaskNum = eighthTaskNum % divider / 10;
                divider /= 100;
                if (eighthTaskNum > 99) {
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
        int ninthTaskNum = 613_333;
        int copyNinthTaskNum = ninthTaskNum;
        System.out.print("Число " + ninthTaskNum);
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 1; i <= 6; i++) {
            if (i > 3) {
                firstHalfSum += ninthTaskNum % 10;
            } else {
                secondHalfSum += ninthTaskNum % 10;
            }
            ninthTaskNum /= 10;
        }
        System.out.print(firstHalfSum == secondHalfSum ? " является счастливым\n" : 
                " не является счастливым\n");
        System.out.println("Сумма цифр " + copyNinthTaskNum / 1000 + " = " + firstHalfSum + 
                ", а сумма " + copyNinthTaskNum % 1000 + " = " + secondHalfSum);

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