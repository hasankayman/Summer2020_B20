package day12_Switch_Scanner;

import java.util.Scanner;

public class sample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int areaCode = scanner.nextInt();
        int localNumber = scanner.nextInt();

        String phoneNumber = "Calling number (" + areaCode + ")-" + localNumber;
        System.out.println(phoneNumber);

    }
}
