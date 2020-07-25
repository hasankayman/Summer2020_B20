package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E, MMM/dd/yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println(LocalDate.of(2020,7,25).format(dateFormat));
        System.out.println(LocalTime.of(15,25,54,10).format(timeFormat));

        DateTimeFormatter todayDateAndTime = DateTimeFormatter.ofPattern("yyyy/MM/dd EEEE hh:mm:ss a");
        DateTimeFormatter rightnow = DateTimeFormatter.ofPattern("h:mm:ss a");

        System.out.println(LocalDateTime.now().format(todayDateAndTime));
        System.out.println(LocalTime.of(10,20,30,40).format(rightnow));


    }
}
