package day07_Unary_Shorthand;

import java.util.Scanner;

public class LeapyYear {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt(); // Line #3, #7 and #8 makes user enter the value.

        int century = year / 100 + 1;
        if (year % 4 == 0) {
            System.out.println("This is a leap year in " + century + " century.");
        } else {
            System.out.println("This is NOT a leap year.");
        }*/
        int a = 3,  b = 2;

long c = (a+b) * 2 / 3 % 2 ;
        System.out.println(c);
    }
}
