package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {
        String[] students = {"Kalbinur", "Hasan", "Odina", "Morris", "Habibe"};
        LocalDate[] birtdays = {LocalDate.of(1982, 12, 26),
                LocalDate.of(1993, 11, 25),
                LocalDate.of(1980, 05, 23),
                LocalDate.of(1990, 2, 21),
                LocalDate.of(1988, 04, 02)};

        DateTimeFormatter dformat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] +" : " + birtdays[i].format(dformat));
        }
    }
}
