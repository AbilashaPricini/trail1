import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentDataAndTimeUsingJava8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
