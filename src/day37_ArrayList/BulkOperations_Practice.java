package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

        //verify that the names Ulku, Busra are contained in students list
        String [] lookfor = {"Ulku", "Busra", "Muhtar"};

        boolean r1 = students.containsAll(Arrays.asList("Ulku", "Busra", "Muhtar"));
        System.out.println(r1);
        students.addAll(Arrays.asList(lookfor));
        System.out.println(students.containsAll(Arrays.asList(lookfor)));

        System.out.println("============================");
        ArrayList <Integer> numbers = new ArrayList<>();
        System.out.println(numbers);
        // add 30,25,40,15,55,65,75,85,95,100

        numbers.addAll(Arrays.asList(30,25,40,15,55,65,75,85,95,100));
        System.out.println(numbers);

        Integer[] addNumbers = {200,300,400};
        numbers.addAll(Arrays.asList(addNumbers));
        System.out.println(numbers);


        System.out.println("================================");

        ArrayList<String> group13 = new ArrayList<>();

        //add all student names in your group
        group13.addAll(Arrays.asList("Hasan", "Marat", "Ali"));

        //verify your mentor and one of friend's name is in the group 13
        boolean r4 = group13.containsAll(Arrays.asList("Mehmet","Hakan"));

        System.out.println(group13);
        System.out.println(r4);








    }
}
