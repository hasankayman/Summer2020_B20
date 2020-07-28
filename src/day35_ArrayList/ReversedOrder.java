package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversedOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 50);
        list.add(3,100);
        System.out.print(list);
        System.out.println();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }



    }
}
