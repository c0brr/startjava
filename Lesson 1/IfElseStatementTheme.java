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
        String name = "Pavel";
        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Имя человека начинается на букву \"M\"");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя человека начинается на букву \"I\"");
        } else {
            System.out.println("Имя человека начниается на букву, отличную от \"M\" и \"I\"");
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

        int num3 = 16;
        if (num3 == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (num3 % 2 != 0) {
                if (num3 < 0) {
                    System.out.println(num3 + " является отрицательным и нечетным");
                } else {
                    System.out.println(num3 + " является положительным и нечетным");
                }
            } else {
                if (num3 < 0) {
                    System.out.println(num3 + " является отрицательным и четным");
                } else {
                    System.out.println(num3 + " является положительным и четным");
                }
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        int num4 = 123;
        int num5 = 223;
        int num4FirstDigit = num4 / 100;
        int num4SecondDigit = num4 / 10 % 10;
        int num4ThirdDigit = num4 % 10;
        int num5FirstDigit = num5 / 100;
        int num5SecondDigit = num5 / 10 % 10;
        int num5ThirdDigit = num5 % 10;
        if (num4FirstDigit == num5FirstDigit) {
            System.out.println("У чисел " + num4 + " и " + num5 + " есть одинаковая цифра \"" + 
                    num4FirstDigit + "\" в 1 разряде");
            if (num4SecondDigit == num5SecondDigit) {
                System.out.println("У чисел " + num4 + " и " + num5 + " есть одинаковая цифра \"" + 
                        num4SecondDigit + "\" во 2 разряде");
            }
            if (num4ThirdDigit == num5ThirdDigit) {
                System.out.println("У чисел " + num4 + " и " + num5 + " есть одинаковая цифра \"" + 
                        num4ThirdDigit + "\" в 3 разряде");
            }
        } else {
            if (num4SecondDigit == num5SecondDigit) {
                System.out.println("У чисел " + num4 + " и " + num5 + " есть одинаковая цифра \"" + 
                        num4SecondDigit + "\" во 2 разряде");
            }
            if (num4ThirdDigit == num5ThirdDigit) {
                System.out.println("У чисел " + num4 + " и " + num5 + " есть одинаковая цифра \"" + 
                        num4ThirdDigit + "\" в 3 разряде");
            }
            if (num4SecondDigit != num5SecondDigit) {
                if (num4ThirdDigit != num5ThirdDigit) {
                    System.out.println("В разрядах чисел " + num4 + " и " + 
                            num5 + " нет одинаковых цифр");
                }
            }
        }

        System.out.println("\n5. Определение символа по его коду\n");

        char symbol = '\u0057';
        if (symbol >= '0') {
            if (symbol <= 'z') {
                if (symbol <= '9') {
                    System.out.println("Символ \"" + symbol + "\" является цифрой");
                } else {
                    if (symbol <= 'Z') {
                        if (symbol >= 'A') {
                            System.out.println("Символ \"" + symbol + "\" является большой буквой");
                        } else {
                            System.out.println("Символ \"" + symbol + "\" не является буквой или цифрой");
                        }
                    }
                    if (symbol < 'a') {
                        if (symbol > 'Z') {
                            System.out.println("Символ \"" + symbol + "\" не является буквой или цифрой");
                        }
                    } else {
                        System.out.println("Символ \"" + symbol + "\" является маленькой буквой");
                    }
                }
            } else {
                System.out.println("Символ \"" + symbol + "\" не является буквой или цифрой");
            }
        } else {
            System.out.println("Символ \"" + symbol + "\" не является буквой или цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");

        int depositAmount = 301_000;
        int depositAnnualPercent;
        if (depositAmount < 100_000) {
            depositAnnualPercent = 5;
        } else {
            if (depositAmount <= 300_000) {
                depositAnnualPercent = 7;
            } else {
                depositAnnualPercent = 10;
            }
        }
        System.out.println("Сумма вклада: " + depositAmount + 
                "\nСумма начисленного %: " + depositAmount / 100 * depositAnnualPercent + 
                "\nИтоговая сумма с %: " + (depositAmount + depositAmount / 100 * depositAnnualPercent));

        System.out.println("\n7. Определение оценки по предметам\n");

        int historyPercent = 59;
        int programmingPercent = 92;
        int historyScore;
        int programmingScore;
        if (historyPercent <= 60) {
            historyScore = 2;
        } else {
            if (historyPercent > 91) {
                historyScore = 5;
            } else {
                if (historyPercent > 73) {
                    historyScore = 4;
                } else {
                    historyScore = 3;
                }
            }
        }
        if (programmingPercent <= 60) {
            programmingScore = 2;
        } else {
            if (programmingPercent > 91) {
                programmingScore = 5;
            } else {
                if (programmingPercent > 73) {
                    programmingScore = 4;
                } else {
                    programmingScore = 3;
                }
            }
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