package day32_MethodOverloading;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 10;
        System.out.println(Arrays.toString(addElement(arr, num)));


    }

    public static int[] addElement(int[] arr, int num) {
        int[] arr2 = new int[arr.length + 1];
        int i = 0;
        for(int each : arr) {
            arr2[i] = each;
            i++;
        }
        arr2[arr2.length - 1] = num;
        return arr2;
    }
}
