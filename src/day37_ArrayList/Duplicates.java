package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,34,5,6,7,8,9,9,9,10,10,11,11,12));
        System.out.println(list);
        list.removeIf(n -> Collections.frequency(list, n) == 1);
        System.out.println(list);
        ArrayList<Integer> newlist = new ArrayList<>();
        for (Integer each : list) {
            if(!newlist.contains(each)) {
                newlist.add(each);
            }
        }
        System.out.println(newlist);
        newlist.removeAll(Arrays.asList(1));
        System.out.println(newlist);

    }
}
