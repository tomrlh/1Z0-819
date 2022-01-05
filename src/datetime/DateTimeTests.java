package datetime;

import java.time.*;

public class DateTimeTests {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(ZonedDateTime.now());
    }
}
