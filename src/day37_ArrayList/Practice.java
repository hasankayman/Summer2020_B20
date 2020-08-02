package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,20,54,1,24,58,67,95,23,54,62));
        numbers.removeIf(number -> number % 2 == 0);
        System.out.println(numbers);


        Predicate<Integer>  oddNumbers = p -> p % 2 != 0 && p > 0 && p < 100;


    }


}
