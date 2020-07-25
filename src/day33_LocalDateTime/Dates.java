package day33_LocalDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1985,04,04);
        LocalDate rightNow =LocalDate.now();
        System.out.println(rightNow);
        System.out.println("Today is " + LocalDate.now());
        Period difference = Period.between(rightNow,dob);
        System.out.println(difference);
        System.out.println("Is this year leap year? " + rightNow.isLeapYear());
        System.out.println("Yes I was born, " + dob.isBefore(rightNow));
        System.out.println("=====================================================");
        LocalTime lastseen = LocalTime.of(20, 15, 59 );
        LocalTime thismoment = LocalTime.now();
        Duration timedifference = Duration.between(thismoment,lastseen);
        System.out.println("I have not seen you for " + Duration.between(lastseen, thismoment));
        System.out.println("*****************************************************");
       /* Scanner scan = new Scanner(System.in);
        LocalDate dob1 = LocalDate.of(scan.nextInt(), scan.nextInt(),scan.nextInt());
        LocalDate today = LocalDate.now();
        yourAge(dob1, today);*/
    }
    public static void yourAge (LocalDate dob, LocalDate now){
        Period difference = Period.between(dob, now);
        int year = difference.getYears();
        int month = difference.getMonths();
        int day = difference.getDays();
        System.out.println("You are " + year + " years " + month + " months " + day + " days old.");
    }

}
