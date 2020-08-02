package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20,50,60,120,56,78,0,-1,-3,400,5000,500));

        //maximum number
        System.out.println("Maximum number in the list is " + Collections.max(list));

        //minimum number
        System.out.println("Maximum number in the list is " + Collections.min(list));

        //sort numbers
        Collections.sort(list);
        System.out.println(list);

        //multiply with -1


    }
}
