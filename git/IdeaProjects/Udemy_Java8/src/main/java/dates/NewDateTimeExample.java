package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {
        //LocalDate
        LocalDate date = LocalDate.now();
        System.out.println("local date - " + date);
        //LocalTime
        LocalTime time = LocalTime.now();
        System.out.println("local time - " + time);
        //LocalDateAndTime
        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("local date and time - " + dateAndTime);
    }
}
