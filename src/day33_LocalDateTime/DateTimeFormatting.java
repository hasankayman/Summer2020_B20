package day33_LocalDateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateTimeFormatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        Integer hou = Integer.parseInt(s.substring(0,s.indexOf(":")));
        Integer min = Integer.parseInt(s.substring(s.indexOf(":") + 1, s.lastIndexOf(":")));
        Integer sec = Integer.parseInt(s.substring(s.lastIndexOf(":")+1, s.lastIndexOf(":")+3));

        DateTimeFormatter civilianTime = DateTimeFormatter.ofPattern("hh:mm:ssa");
        System.out.println(LocalTime.of(hou,min,sec).format(civilianTime));
        DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println();

    }
}
