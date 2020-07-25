package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(LocalDate.of(2020,7,25).format(dateFormat));
        System.out.println(LocalTime.of(15,25,54,10).format(timeFormat));
    }
}
