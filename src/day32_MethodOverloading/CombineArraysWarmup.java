package day32_MethodOverloading;

import java.util.Arrays;

public class CombineArraysWarmup {

    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int[] combinedArray = new int[arr1.length + arr2.length];
        int index = 0;
        for (int each : arr1) {
            combinedArray[index] = each;
            index++;
        }
        for (int each : arr2) {
            combinedArray[index] = each;
            index++;
        }
        return combinedArray;
    }

    public static String[] combineArrays(String[] arr1, String[] arr2) {
        String[] combinedArray = new String[arr1.length + arr2.length];
        int index = 0;
        for (String each : arr1) {
            combinedArray[index] = each;
            index++;
        }
        for (String each : arr2) {
            combinedArray[index] = each;
            index++;
        }
        return combinedArray;
    }

    public static char[] combineArrays(char[] arr1, char[] arr2) {
        char[] combinedArray = new char[arr1.length + arr2.length];
        int index = 0;
        for (char each : arr1) {
            combinedArray[index] = each;
            index++;
        }
        for (char each : arr2) {
            combinedArray[index] = each;
            index++;
        }
        return combinedArray;
    }


    public static void main(String[] args) {
        int[] array1 = {26, 31, 85, 47};
        int[] array2 = {39, 62, 70};
        String[] names1 = {"Kayman", "Martin", "Ward"};
        String[] names2 = {"Rees", "Miguel", "Morris", "Youmans"};
        char[] chars1 = {'A', 'L', 'X'};
        char[] chars2 = {'K', 'A', 'R', 'Z'};
        System.out.println(Arrays.toString(combineArrays(array1, array2)));
        System.out.println(Arrays.toString(combineArrays(names1, names2)));
        System.out.println(Arrays.toString(combineArrays(chars1, chars2)));
    }
}
