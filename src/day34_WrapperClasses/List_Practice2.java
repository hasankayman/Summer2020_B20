package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(30);
        list.add(110);
        list.add(200);
        list.add(1440);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer each : list) {
            if(each > max) {
                max = each;
            }
            if(each < min) {
                min = each;
            }
        }
        System.out.println("My list is the following: " + list);
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);

    }
}
