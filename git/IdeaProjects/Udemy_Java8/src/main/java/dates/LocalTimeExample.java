package dates;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : " + localTime);

        System.out.println("get hour : " + localTime.getHour());
    }
}
