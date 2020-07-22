package day11_NestedIf_Switch;

import java.util.Scanner;

public class warmup_daysinthemonth {
    public static void main(String[] args) {
        //DO NOT CHANGE:
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();

        String report = age < 2 ? "ineligible" : age == 2 ? "toddler" : age > 2 && age < 6 ? "early childhood"
                : age > 5 && age < 8 ? "young reader" : age > 7 && age < 11 ? "elementary" : age == 11 || age == 12
                ? "middle" : age == 13 ? "impossible" : age > 13 && age < 17 ? "high school" : age > 16 && age < 19
                ? "scholar" : age > 18 ? "ineligible": "" ;

        System.out.println(report);

    }
}

