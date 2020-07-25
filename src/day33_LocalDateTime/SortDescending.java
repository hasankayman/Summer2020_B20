package day33_LocalDateTime;

import java.util.Arrays;

public class SortDescending {
    public static int[] sortArrayDescending(int[] array) {
        int[] reversed = new int[array.length];
        int i = array.length - 1;
        for (int each : array) {
            reversed[i] = each;
            i--;
        }
        return reversed;
    }

    public static double[] sortArrayDescending(double[] array) {
        double[] reversed = new double[array.length];
        int i = array.length - 1;
        for (double each : array) {
            reversed[i] = each;
            i--;
        }
        return reversed;
    }

    public static String[] sortArrayDescending(String[] array) {
        String[] reversed = new String[array.length];
        int i = array.length - 1;
        for (String each : array) {
            reversed[i] = each;
            i--;
        }
        return reversed;
    }

    public static char[] sortArrayDescending(char[] array) {
        char[] reversed = new char[array.length];
        int i = array.length - 1;
        for (char each : array) {
            reversed[i] = each;
            i--;
        }
        return reversed;
    }
}
