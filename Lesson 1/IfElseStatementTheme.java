public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");

        boolean isGenderMale = true;
        if (!isGenderMale) {
            System.out.println("Этот человек - женщина");
        } else {
            System.out.println("Этот человек - мужчина");
        }

        int age = 25;
        if (age > 18) {
            System.out.println("Этот человек - совершеннолетний");
        } else {
            System.out.println("Этот человек - несовершеннолетний");
        }

        double height = 1.72;
        if (height < 1.8) {
            System.out.println("Этот человек - невысокий");
        } else {
            System.out.println("Этот человек - высокий");
        }

        char firstLetterName = "Pavel".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Имя человека начинается на букву \"M\"");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя человека начинается на букву \"I\"");
        } else {
            System.out.println("Имя человека начинается на букву, отличную от \"M\" и \"I\"");
        }

        System.out.println("\n2. Поиск большего числа\n");

        int num1 = 246;
        int num2 = 6;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " больше, чем число " + num2);
        } else if (num1 == num2) {
            System.out.println("Числa " + num1 + " и " + num2 + " равны");
        } else {
            System.out.println("Число " + num2 + " больше, чем число " + num1);
        }

        System.out.println("\n3. Проверка числа\n");

        int num3 = -31;
        if (num3 == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.print("Число " + num3 + " является ");
            if (num3 > 0) {
                System.out.print("положительным и ");
            } else {
                System.out.print("отрицательным и ");
            }
            if (num3 % 2 == 0) {
                System.out.print("четным");
            } else {
                System.out.print("нечетным");
            }
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");

        int num4 = 123;
        int num5 = 223;
        int num4Hundreds = num4 / 100;
        int num4Tens = num4 / 10 % 10;
        int num4Ones = num4 % 10;
        int num5Hundreds = num5 / 100;
        int num5Tens = num5 / 10 % 10;
        int num5Ones = num5 % 10;
        if (num4Hundreds != num5Hundreds) {
            if (num4Tens != num5Tens) {
                if (num4Ones != num5Ones) {
                    System.out.println("В разрядах чисел " + num4 + " и " + num5 + " нет одинаковых цифр");
                }
            }
        }
        if (num4Hundreds == num5Hundreds) {
            System.out.println("В раязряде сотен чисел " + num4 + " и " + num5 + 
                    " есть одинаковая цифра " + num4Hundreds);
        }
        if (num4Tens == num5Tens) {
            System.out.println("В разряде десятков чисел " + num4 + " и " + num5 + 
                    " есть одинаковая цифра " + num4Tens);
        }
        if (num4Ones == num5Ones) {
            System.out.println("В разряде единиц чисел " + num4 + " и " + num5 + 
                    " есть одинаковая цифра " + num4Ones);
        }

        System.out.println("\n5. Определение символа по его коду\n");

        char symbol = '\u0057';
        if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ \"" + symbol + "\" является цифрой");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ \"" + symbol + "\" является большой буквой");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ \"" + symbol + "\" является маленькой буквой");
        }  else {
            System.out.println("Символ \"" + symbol + "\" не является буквой или цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");

        int depositAmount = 10_000;
        int depositAnnualPercent = 7;
        if (depositAmount < 100_000) {
            depositAnnualPercent = 5;
        } else if (depositAmount > 300_000) {
            depositAnnualPercent = 10;
        }
        int depositAnnualPercentSum = depositAmount / 100 * depositAnnualPercent;
        System.out.println("Сумма вклада: " + depositAmount + 
                "\nСумма начисленного %: " + depositAnnualPercentSum + 
                "\nИтоговая сумма с %: " + (depositAmount + depositAnnualPercentSum));

        System.out.println("\n7. Определение оценки по предметам\n");

        int historyPercent = 92;
        int historyScore = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyScore = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyScore = 4;
        } else if (historyPercent > 91) {
            historyScore = 5;
        }
        int programmingPercent = 91;
        int programmingScore = 2;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingScore = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingScore = 4;
        } else if (programmingPercent > 91) {
            programmingScore = 2;
        }
        System.out.println("Оценка по истории - " + historyScore + 
                "\nОценка по программированию - " + programmingScore + 
                "\nСредний балл оценок по предметам - " + (double) (programmingScore + historyScore) / 2 + 
                "\nСредний % по предметам - " + (double) (historyPercent + programmingPercent) / 2);

        System.out.println("\n8. Расчет годовой прибыли\n");

        int profitMonth = 13_000;
        int rentPremisesMonth = 5_000;
        int costProductionMonth = 9_000;
        int profitYear = (profitMonth - rentPremisesMonth - costProductionMonth) * 12;
        if (profitYear > 0) {
            System.out.println("Прибыль за год: +" + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitYear + " руб.");
        }
    }
}