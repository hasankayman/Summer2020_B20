package day08_LogicalOperations;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        int age = scanner.nextInt();
        String citizenship = scanner.next();
        if (age >= 18 && citizenship.equalsIgnoreCase("USA")){
            System.out.println(fullName + ", you are eligible to vote.");
        } else {
            System.out.println(fullName + ", you are NOT eligible to vote.");
        }
    }
}
