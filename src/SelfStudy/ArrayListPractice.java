package SelfStudy;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        for(Integer each : mylist) {
            each = (int) Math.random();
            mylist.add(each);
        }
        System.out.println(mylist);
    }


}
