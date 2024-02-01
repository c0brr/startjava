package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");

        byte cpuCores = 8;
        System.out.println("Количество ядер в процессоре: " + cpuCores);
        short ramCapacity = 16;
        System.out.println("Объем оперативной памяти, Гб: " + ramCapacity);
        int cpuFrequency = 3_500;
        System.out.println("Частота процессора, МГц: " + cpuFrequency);
        long amountGpuTransistors = 14_000_000_000L;
        System.out.println("Количество транзисторов видеокарты: " + amountGpuTransistors);
        float cpuTechProcess = 0.09f;
        System.out.println("Техпроцесс процессора, нм: " + cpuTechProcess);
        double cpuHeatGeneration = 95.6;
        System.out.println("Тепловыделение процессора, Вт: " + cpuHeatGeneration);
        char cpuModel = 'i';
        System.out.println("Модель процессора: " + cpuModel);
        boolean isNvidiaGpuManufacturer = true;
        System.out.println("Производитель видеокарты - Nvidia: " + isNvidiaGpuManufacturer);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int penCost = 100;
        int bookCost = 200;
        int productsTotalCost = penCost + bookCost;
        int discountPercent = 11;
        int discountAmount = productsTotalCost / 100 * discountPercent;
        System.out.println("Общая стоимость товаров без скидки, руб.: " + productsTotalCost);
        System.out.println("Сумма скидки, руб.: " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой, руб.: " + 
                (productsTotalCost - discountAmount));

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Вывод для byte: \n" + maxByte + "\n" + ++maxByte + "\n" + 
                --maxByte + "\n");
        System.out.println("Вывод для short: \n" + maxShort + "\n" + ++maxShort + "\n" + 
                --maxShort + "\n");
        System.out.println("Вывод для int: \n" + maxInt + "\n" + ++maxInt + "\n" + 
                --maxInt + "\n");
        System.out.println("Вывод для long: \n" + maxLong + "\n" + ++maxLong + "\n" + 
                --maxLong);

        System.out.println("\n5. Перестановка значений переменных\n");

        int num1 = 2;
        int num2 = 5;
        int num3 = num1;
        System.out.println("Перестановка с помощью третьей переменной\nИсходные значения переменных:\n" + 
                num1 + " " + num2);
        num1 = num2;
        num2 = num3;
        System.out.println("Новые значения переменных:\n" + num1 + " " + num2 + 
                "\n\nПерестановка с помощью арифметических операций\nИсходные значения переменных:\n" + 
                num1 + " " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения переменных:\n" + num1 + " " + num2 + 
                "\n\nПерестановка с помощью арифметических операций\nИсходные значения переменных:\n" + 
                num1 + " " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных:\n" + num1 + " " + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + "   " + dollar);
        System.out.println((int) asterisk + "   " + asterisk);
        System.out.println((int) atSign + "   " + atSign);
        System.out.println((int) verticalBar + "  " + verticalBar);
        System.out.println((int) tilde + "  " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash + "\n" + 
                "   " + slash + "  " + backslash + "\n" + 
                "  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash + "\n" + 
                " " + slash + "      " + backslash + "\n" + 
                slash + underscore + underscore + underscore + underscore + slash + backslash + 
                underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num4 = 123;
        int num4Hundreds = num4 / 100;
        int num4Tens = num4 / 10 % 10;
        int num4Ones = num4 % 10;
        System.out.println("Число " + num4 + " содержит:" + 
                "\n  сотен - " + num4Hundreds + 
                "\n  десятков - " + num4Tens + 
                "\n  единиц - " + num4Ones + 
                "\nСумма его цифр = " + (num4Hundreds + num4Tens + num4Ones) + 
                "\nПроизведение = " + num4Hundreds * num4Tens * num4Ones);

        System.out.println("\n9. Вывод времени\n");

        int secondsTotal = 86_399;
        int hours = secondsTotal / 3_600;
        int minutes = secondsTotal / 60 % 60;
        int seconds = secondsTotal % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}