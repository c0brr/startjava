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
        int discountPercent = 11;
        System.out.println("Общая стоимость товаров без скидки, руб.: " + (penCost + bookCost));
        System.out.println("Сумма скидки, руб.: " + ((penCost + bookCost) / 100 * discountPercent));
        System.out.println("Общая стоимость товаров со скидкой, руб.: " + 
                (penCost + bookCost - (penCost + bookCost) / 100 * discountPercent));

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte maxByteNumb = 127;
        short maxShortNumb = 32_767;
        int maxIntNumb = 2_147_483_647;
        long maxLongNumb = 9_223_372_036_854_775_807L;
        System.out.println("Вывод для byte: \n" + maxByteNumb + "\n" + ++maxByteNumb + "\n" + 
                --maxByteNumb + "\n");
        System.out.println("Вывод для short: \n" + maxShortNumb + "\n" + ++maxShortNumb + "\n" + 
                --maxShortNumb + "\n");
        System.out.println("Вывод для int: \n" + maxIntNumb + "\n" + ++maxIntNumb + "\n" + 
                --maxIntNumb + "\n");
        System.out.println("Вывод для long: \n" + maxLongNumb + "\n" + ++maxLongNumb + "\n" + 
                --maxLongNumb + "\n");

        System.out.println("\n5. Перестановка значений переменных\n");

        int numb1 = 2;
        int numb2 = 5;
        int numb3;
        System.out.println("Перестановка с помощью третьей переменной\n" + numb1 + " " + numb2);
        numb3 = numb1;
        numb1 = numb2;
        numb2 = numb3;
        System.out.println(numb1 + " " + numb2 + "\n");
        System.out.println("Перестановка с помощью арифметических операций\n" + numb1 + " " + numb2);
        numb3 = numb1 + numb2;
        numb2 = numb3 - numb2;
        numb1 = numb3 - numb1;
        System.out.println(numb1 + " " + numb2 + "\n");
        System.out.println("Перестановка с помощью побитовой операции ^\n" + numb1 + " " + numb2);
        numb3 = numb1;
        numb1 = numb1 ^ numb1 + numb2;
        numb2 = numb2 ^ numb2 + numb3;
        System.out.println(numb1 + " " + numb2 + "\n");

        System.out.println("\n6. Вывод символов и их кодов\n");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println(36 + "   " + dollar);
        System.out.println(42 + "   " + asterisk);
        System.out.println(64 + "   " + atSign);
        System.out.println(124 + "  " + verticalBar);
        System.out.println(126 + "  " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash + "\n" + "   " + slash + "  " + 
                backslash + "\n" + "  " + slash + underscore + leftParenthesis + 
                " " + rightParenthesis + backslash + "\n" + " " + slash + "      " + 
                backslash + "\n" + slash + underscore + underscore + underscore + 
                underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int number = 123;
        int numberHundreds = number / 100;
        int numberDecades = number % 100 / 10;
        int numberUnits = number % 100 % 10;
        System.out.println("Число " + number + " содержит:\n" + "  сотен - " + numberHundreds + 
                "\n  десятков - " + numberDecades + "\n  единиц - " + numberUnits + "\nСумма его цифр = " + 
                (numberHundreds + numberDecades + numberUnits) + "\nПроизведение = " + numberHundreds * 
                numberDecades * numberUnits);

        System.out.println("\n9. Вывод времени\n");

        int secondsTotal = 86_399;
        int hours = secondsTotal / 3_600;
        int minutes = secondsTotal % 3_600 / 60;
        int seconds = secondsTotal % 3_600 % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}