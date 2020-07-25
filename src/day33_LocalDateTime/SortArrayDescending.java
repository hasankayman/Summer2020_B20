package day33_LocalDateTime;

import java.util.Arrays;

public class SortArrayDescending {
    public static int[] sortArrayDescendingOrder(int[] array) {
        Arrays.sort(array);
        int[] reversed = new int[array.length];
        int i = array.length - 1;
        for(int each : array) {
            reversed[i] = each;
            i--;
        }
        return reversed;
    }

    public static double[] sortArrayDescendingOrder(double[] array) {
        Arrays.sort(array);
        double[] reversed = new double[array.length];
        int i = array.length - 1;
        for(double each : array) {
            reversed[i] = each;
            i--;
        }
        return reversed;
    }

    public static String[] sortArrayDescendingOrder(String[] array) {
        Arrays.sort(array);
        String[] reversed = new String[array.length];
        int i = array.length - 1;
        for(String each : array) {
            reversed[i] = each;
            i--;
        }
        return reversed;
    }

    public static char[] sortArrayDescendingOrder(char[] array) {
        Arrays.sort(array);
        char[] reversed = new char[array.length];
        int i = array.length - 1;
        for(char each : array) {
            reversed[i] = each;
            i--;
        }
        return reversed;
    }
}
