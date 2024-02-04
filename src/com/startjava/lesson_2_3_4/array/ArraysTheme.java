package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArray();
        multiplyArrayElements();
        deleteArrayElements();
        displayAlphabetLadder();
        fillArrayUniqeNums();
    }

    private static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] segmentNums = {5, 2, 6, 1, 3, 7, 4};
        int length = segmentNums.length;
        System.out.print("До реверса: [");
        printArray(segmentNums);

        for (int i = 0, j = length - 1; i < 3; i++, j--) {
            int storedNum = segmentNums[i];
            segmentNums[i] = segmentNums[j];
            segmentNums[j] = storedNum;
        }

        System.out.print("\nПосле реверса: [");
        printArray(segmentNums);
    }

    private static void multiplyArrayElements() {
        System.out.println("\n\n2. Произведение элементов массива");
        int[] segmentNums = new int[10];
        int length = segmentNums.length;
        for (int i = 0; i < length; i++) {
            segmentNums[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= segmentNums[i];
            System.out.print(segmentNums[i]);
            System.out.print(i == length - 2 ? " = " + result : " * ");
        }
    }

    private static void deleteArrayElements() {
        System.out.println("\n\n3. Удаление элементов массива");
        float[] randomFloatNums = new float[15];
        Random rnd = new Random();
        int length = randomFloatNums.length;
        for (int i = 0; i < length; i++) {
            randomFloatNums[i] = rnd.nextFloat();
        }
        float middleIndexNum = randomFloatNums[length / 2];

        System.out.print("Исходный массив: \n");
        printArray(randomFloatNums);

        int amountDeletedCells = 0;
        for (int i = 0; i < length; i++) {
            if (randomFloatNums[i] > middleIndexNum) {
                randomFloatNums[i] = 0;
                amountDeletedCells++;
            }
        }

        System.out.print("\n\nИзмененный массив: \n");
        printArray(randomFloatNums);

        System.out.println("\n\nКоличество обнуленных ячеек: " + amountDeletedCells);
    }

    private static void displayAlphabetLadder() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabetCapitalLetters = new char[26];
        int length = alphabetCapitalLetters.length;
        for (int i = 0; i < length; i++) {
            alphabetCapitalLetters[i] = (char) ('A' + i);
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(alphabetCapitalLetters[j]);
            }
            System.out.println();
        }
    }

    private static void fillArrayUniqeNums() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] uniqueNums = new int[30];
        int length = uniqueNums.length;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            boolean isUnique = false;
            while (!isUnique) {
                int randomNum = random.nextInt(60, 100);
                for (int j = 0; j < length; j++) {
                    if (randomNum == uniqueNums[j] && i != j) {
                        break;
                    }
                    if (j == length - 1) {
                        isUnique = true;
                        uniqueNums[i] = randomNum;
                    }
                }
            }
        }
        Arrays.sort(uniqueNums);
        int numCounter = 0;
        for (int num: uniqueNums) {
            numCounter++;
            System.out.print(num);
            System.out.print(num != uniqueNums[length-1] ? ", " : ".");
            if (numCounter % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num);
            System.out.print(num == array[array.length - 1] ? "]" : ", ");
        }
    }

    private static void printArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f", array[i]);
            System.out.print(i == array.length - 1 ? "." : ", ");
            if (array[i] == array[array.length / 2]) {
                System.out.println();
            }
        }
    }
}