package day33_LocalDateTime;

import java.time.Duration;
import java.time.LocalTime;

public class CountDownTimer {
    public static void main(String[] args) throws InterruptedException {
        LocalTime endtime = LocalTime.of(15,00,00);
        System.out.println("Today class will last today at " + endtime);

        while(endtime.isAfter(LocalTime.now())) {
           int seconds = (int) Duration.between(LocalTime.now(),endtime).getSeconds();
           System.out.println("We have " + seconds + " seconds to finish today class");
           Thread.sleep(1000);

        }
    }
}
