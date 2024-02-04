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

    public static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] nums = {5, 2, 6, 1, 3, 7, 4};
        int length = nums.length;
        int[] reverseNums = new int[length];
        System.out.print("До реверса: [");
        printArray1(nums, length);

        int index = length - 1;
        for (int num : nums) {
            reverseNums[index] = num;
            index--;
        }
        index = 0;
        for (int num : reverseNums) {
            nums[index] = num;
            index++;
        }

        System.out.print("\nПосле реверса: [");
        printArray1(nums, length);
    }

    public static void multiplyArrayElements() {
        System.out.println("\n\n2. Произведение элементов массива");
        int[] nums = new int[10];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            nums[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= nums[i];
            System.out.print(i == length - 2 ? nums[i] + " = " + result : nums[i] + " * ");
        }
    }

    public static void deleteArrayElements() {
        System.out.println("\n\n3. Удаление элементов массива");
        Random random = new Random();
        float[] nums = new float[15];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            nums[i] = random.nextFloat();
        }
        float middleIndexNum = nums[length / 2];

        System.out.print("Исходный массив: \n[");
        printArray2(nums, length, middleIndexNum);

        int amountDeletedCells = 0;
        System.out.print("\n\nИзмененный массив: \n[");
        for (int i = 0; i < length; i++) {
            if (nums[i] > middleIndexNum) {
                nums[i] = 0.0f;
                amountDeletedCells++;
            }
        }
        printArray2(nums, length, middleIndexNum);
        System.out.println("\n\nКоличество обнуленных ячеек: " + amountDeletedCells);
    }

    public static void displayAlphabetLadder() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] letters = new char[26];
        int length = letters.length;
        for (int i = 0, j = 65; i < length; i++, j++) {
            letters[i] = (char) j;
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int k = length - 1; k >= i; k--) {
                System.out.print(letters[k]);
            }
            System.out.println();
        }
    }

    public static void fillArrayUniqeNums() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] nums = new int[30];
        int length = nums.length;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            boolean isNumberUnique = false;
            while (!isNumberUnique) {
                nums[i] = random.nextInt(60, 100);
                for (int j = 0; j < length; j++) {
                    if (nums[i] == nums[j] && i != j) {
                        break;
                    }
                    if (j == length - 1) {
                        isNumberUnique = true;
                    }
                }
            }
        }
        Arrays.sort(nums);
        System.out.print("[");
        int numCounter = 0;
        for (int num: nums) {
            numCounter++;
            System.out.print(num);
            System.out.print(num == nums[length - 1] ? "]" : ", ");
            if (numCounter % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void printArray1(int[] nums, int length) {
        for (int num: nums) {
            System.out.print(num);
            System.out.print(num == nums[length - 1] ? "]" : ", ");
        }
    }

    private static void printArray2(float[] nums, int length, float middleIndexNum) {
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f", nums[i]);
            System.out.print(i == length - 1 ? "]" : ", ");
            if (nums[i] == middleIndexNum) {
                System.out.println();
            }
        }
    }
}