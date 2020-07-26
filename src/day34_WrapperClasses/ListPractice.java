package day34_WrapperClasses;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> oddlist = new ArrayList<>();
        ArrayList<Integer> evenlist = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                evenlist.add(i);
            } else {
                oddlist.add(i);
            }
        }
        System.out.println(oddlist);
        System.out.println(evenlist);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ArrayList<String> grocerylist = new ArrayList<>();
        grocerylist.add("Milk");
        grocerylist.add("Apple");
        grocerylist.add("Eggs");
        grocerylist.add("Mango");
        grocerylist.add("Ice cream");

        for (int i = grocerylist.size() - 1; i >= 0; i--) {
            System.out.print(grocerylist.get(i) + "\t");
        }
        System.out.println();

        for(String each : grocerylist) {
            System.out.print(each + "\t");
        }
    }


}
