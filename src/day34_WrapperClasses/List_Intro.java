package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(95); // autoboxing happened  // index 0;
        mylist.add(100); // index 1
        mylist.add(33);//index 2
        mylist.add(76);  // index 4
        mylist.add(45);  // index 6
        mylist.add(3, 99);
        mylist.add(5, 20);



        System.out.println(mylist);
        System.out.println(mylist.get(6));
    }

}
