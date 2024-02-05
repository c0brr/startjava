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
        int[] nums = {5, 2, 6, 1, 3, 7, 4};
        int length = nums.length;
        System.out.print("До реверса: [");
        printArray(nums);

        for (int i = 0; i <= length / 2; i++) {
            int swap = nums[i];
            nums[i] = nums[--length];
            nums[length] = swap;
        }

        System.out.print("\nПосле реверса: [");
        printArray(nums);
    }

    private static void multiplyArrayElements() {
        System.out.println("\n\n2. Произведение элементов массива");
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= multipliers[i];
            System.out.print(multipliers[i]);
            System.out.print(i == length - 2 ? " = " + result : " * ");
        }
    }

    private static void deleteArrayElements() {
        System.out.println("\n\n3. Удаление элементов массива");
        float[] randomFloats = new float[15];
        Random rnd = new Random();
        int length = randomFloats.length;
        for (int i = 0; i < length; i++) {
            randomFloats[i] = rnd.nextFloat();
        }
        float middleIndexNum = randomFloats[length / 2];

        System.out.print("Исходный массив: \n");
        printArray(randomFloats);

        int amountDeletedCells = 0;
        for (int i = 0; i < length; i++) {
            if (randomFloats[i] > middleIndexNum) {
                randomFloats[i] = 0;
                amountDeletedCells++;
            }
        }

        System.out.print("\n\nИзмененный массив: \n");
        printArray(randomFloats);

        System.out.println("\n\nКоличество обнуленных ячеек: " + amountDeletedCells);
    }

    private static void displayAlphabetLadder() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
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
                for (int j = 0; j <= i; j++) {
                    if (randomNum == uniqueNums[j] && i != j) {
                        break;
                    }
                    if (j == i) {
                        isUnique = true;
                        uniqueNums[i] = randomNum;
                    }
                }
            }
        }
        Arrays.sort(uniqueNums);
        for (int i = 0; i < length; i++) {
            System.out.print(uniqueNums[i]);
            System.out.print(uniqueNums[i] != uniqueNums[length - 1] ? ", " : ".");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num);
            System.out.print(num == array[array.length - 1] ? "]" : ", ");
        }
    }

    private static void printArray(float[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f", array[i]);
            System.out.print(i == length - 1 ? "." : ", ");
            if (array[i] == array[length / 2]) {
                System.out.println();
            }
        }
    }
}