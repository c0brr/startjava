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
        int penAndBookTotalCost = penCost + bookCost;
        int discountPercent = 11;
        System.out.println("Общая стоимость товаров без скидки, руб.: " + penAndBookTotalCost);
        System.out.println("Сумма скидки, руб.: " + penAndBookTotalCost / 100 * discountPercent);
        System.out.println("Общая стоимость товаров со скидкой, руб.: " + 
                (penAndBookTotalCost - penAndBookTotalCost / 100 * discountPercent));

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

        int numb1 = 2;
        int numb2 = 5;
        int numb3 = numb1;
        System.out.println("Перестановка с помощью третьей переменной\nИсходные значения переменных:\n" + 
                numb1 + " " + numb2);
        numb1 = numb2;
        numb2 = numb3;
        System.out.println("Новые значения переменных:\n" + numb1 + " " + numb2 + 
                "\n\nПерестановка с помощью арифметических операций\nИсходные значения переменных:\n" + 
                numb1 + " " + numb2);
        numb1 += numb2;
        numb2 = numb1 - numb2;
        numb1 -= numb2;
        System.out.println("Новые значения переменных:\n" + numb1 + " " + numb2 + 
                "\n\nПерестановка с помощью арифметических операций\nИсходные значения переменных:\n" + 
                numb1 + " " + numb2);
        numb1 ^= numb2;
        numb2 ^= numb1;
        numb1 ^= numb2;
        System.out.println("Новые значения переменных:\n" + numb1 + " " + numb2);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        int dollarCode = 36;
        int asteriskCode = 42;
        int atSignCode = 64;
        int verticalBarCode = 124;
        int tildeCode = 126;
        System.out.println(dollarCode + "   " + dollar);
        System.out.println(asteriskCode + "   " + asterisk);
        System.out.println(atSignCode + "   " + atSign);
        System.out.println(verticalBarCode + "  " + verticalBar);
        System.out.println(tildeCode + "  " + tilde);

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

        int numb4 = 123;
        int numb4Hundreds = numb4 / 100;
        int numb4Tens = numb4 / 10 % 10;
        int numb4Ones = numb4 % 10;
        System.out.println("Число " + numb4 + " содержит:\n" + "  сотен - " + numb4Hundreds + 
                "\n  десятков - " + numb4Tens + "\n  единиц - " + numb4Ones + "\nСумма его цифр = " + 
                (numb4Hundreds + numb4Tens + numb4Ones) + "\nПроизведение = " + numb4Hundreds * 
                numb4Tens * numb4Ones);

        System.out.println("\n9. Вывод времени\n");

        int secondsTotal = 86_399;
        int hours = secondsTotal / 3_600;
        int minutes = secondsTotal / 60 % 60;
        int seconds = secondsTotal % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}