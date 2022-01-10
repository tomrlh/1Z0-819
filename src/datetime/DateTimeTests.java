package datetime;

import java.time.*;

public class DateTimeTests {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(ZonedDateTime.now());

        var dt1 = LocalDateTime.of(
                2020,
                Month.OCTOBER,
                20,
                6,
                15,
                30);

        var dt2 = LocalDate.of(2022, Month.OCTOBER, 20);
        var dt3 = LocalTime.of(6, 30);
        var dt4 = LocalDateTime.of(dt2, dt3);
    }
}
