package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {
    public Constructor(){
        System.out.println("No arg constructor");
    }
    public Constructor(int a) {
        System.out.println("with int argument " + a);
    }
    public Constructor(String a) {
        System.out.println("with String argument " + a);
    }
    public Constructor(int a, int b) {
        System.out.println("with int arguments " + a + " and " + b);
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(10);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

//        ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println(list2);



    }
}
