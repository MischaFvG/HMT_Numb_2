package com.katzen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework_number_2");
        System.out.println("Task_1");
        Scanner w = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        String jewelers;
        String stones;
        System.out.println("Enter string of jewelers");
        jewelers = s.nextLine();
        System.out.println("String of jewelers is " + jewelers);
        System.out.println("Enter string of stones");
        stones = s.nextLine();
        System.out.println("String of stones is " + stones);
        numJewelersInStones(jewelers, stones);
        System.out.println("Task_2");
        int arraySize;
        System.out.println("Enter size of array");
        arraySize = w.nextInt();
        System.out.println("Array size is " + arraySize);
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the " + i + " element of array : ");
            array[i] = w.nextInt();
        }
        System.out.println("Your array is " + Arrays.toString(array));
        int z;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    z = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = z;
                }
            }
        }
        System.out.println("Sorted array is " + Arrays.toString(array));
        System.out.println("Final array is " + Arrays.toString(arrayMethod(array)));
        System.out.println("Task_3");
        Map<String, String> latinAlphabet = new HashMap<>();
        latinAlphabet.put("A", "a");
        latinAlphabet.put("B", "b");
        latinAlphabet.put("C", "c");
        latinAlphabet.put("D", "d");
        latinAlphabet.put("E", "e");
        latinAlphabet.put("F", "f");
        latinAlphabet.put("G", "g");
        latinAlphabet.put("H", "h");
        latinAlphabet.put("I", "i");
        latinAlphabet.put("J", "j");
        latinAlphabet.put("K", "k");
        latinAlphabet.put("L", "l");
        latinAlphabet.put("M", "m");
        latinAlphabet.put("N", "n");
        latinAlphabet.put("O", "o");
        latinAlphabet.put("P", "p");
        latinAlphabet.put("Q", "q");
        latinAlphabet.put("R", "r");
        latinAlphabet.put("S", "s");
        latinAlphabet.put("T", "t");
        latinAlphabet.put("U", "u");
        latinAlphabet.put("V", "v");
        latinAlphabet.put("W", "w");
        latinAlphabet.put("X", "x");
        latinAlphabet.put("Y", "y");
        latinAlphabet.put("Z", "z");
        latinAlphabet.put("a", "a");
        latinAlphabet.put("b", "b");
        latinAlphabet.put("c", "c");
        latinAlphabet.put("d", "d");
        latinAlphabet.put("e", "e");
        latinAlphabet.put("f", "f");
        latinAlphabet.put("g", "g");
        latinAlphabet.put("h", "h");
        latinAlphabet.put("i", "i");
        latinAlphabet.put("j", "j");
        latinAlphabet.put("k", "k");
        latinAlphabet.put("l", "l");
        latinAlphabet.put("m", "m");
        latinAlphabet.put("n", "n");
        latinAlphabet.put("o", "o");
        latinAlphabet.put("p", "p");
        latinAlphabet.put("q", "q");
        latinAlphabet.put("r", "r");
        latinAlphabet.put("s", "s");
        latinAlphabet.put("t", "t");
        latinAlphabet.put("u", "u");
        latinAlphabet.put("v", "v");
        latinAlphabet.put("w", "w");
        latinAlphabet.put("x", "x");
        latinAlphabet.put("y", "y");
        latinAlphabet.put("0", "0");
        latinAlphabet.put("1", "1");
        latinAlphabet.put("2", "2");
        latinAlphabet.put("3", "3");
        latinAlphabet.put("4", "4");
        latinAlphabet.put("5", "5");
        latinAlphabet.put("6", "6");
        latinAlphabet.put("7", "7");
        latinAlphabet.put("8", "8");
        latinAlphabet.put("9", "9");
        latinAlphabet.put("_", "_");
        latinAlphabet.put(" ", " ");
        latinAlphabet.put("!", "!");
        latinAlphabet.put(".", ".");
        latinAlphabet.put(":", ":");
        latinAlphabet.put(";", ";");
        latinAlphabet.put("?", "?");
        latinAlphabet.put("#", "#");
        latinAlphabet.put("/", "/");
        latinAlphabet.put("@", "@");
        String string1;
        System.out.println("Enter string");
        string1 = s.nextLine();
        System.out.println("String is " + string1);
        StringBuilder stringBuilderString1 = new StringBuilder(string1.length());
        for (int i = 0; i < string1.length(); i++) {
            String str5 = string1.substring(i, i + 1);
            if (latinAlphabet.containsKey(str5)) {
                stringBuilderString1.append(latinAlphabet.get(str5));
            }
        }
        System.out.println("New string is " + stringBuilderString1.toString());

    }

    public static void numJewelersInStones(String jewelers, String stones) {
        int count = 0;
        char[] jewelersCharArray = jewelers.toCharArray();
        char[] stonesCharArray = stones.toCharArray();
        for (int i = 0; i < jewelersCharArray.length; i++) {
            for (int j = 0; j < stonesCharArray.length; j++) {
                if (jewelersCharArray[i] == stonesCharArray[j]) {
                    count++;
                }
            }
        }
        System.out.println("Count of jewelers in stones is " + count);
    }

    public static int[] arrayMethod(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2);
        }
        System.out.println("Array in second degree is " + Arrays.toString(array));
        int z;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    z = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = z;
                }
            }
        }
        return array;
    }
}
