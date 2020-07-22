package replit;

import java.util.Scanner;

public class breakCountDown {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int i, j;

        System.out.print("How many minutes do we have for break: ");
        int minute = scanner.nextInt();

        for (i = minute; i >= 0; i--) {
            for (j = 59; j >= 0; j--) {
                System.out.printf("%02d Minutes %02d Seconds left.\n",i,j);
                Thread.sleep(1000);
            }
        }
        System.out.println("Time is up!");
    }
}