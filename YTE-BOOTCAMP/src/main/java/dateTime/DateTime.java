package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

    public static void main(String args[]) {

        Date date = new Date();
        System.out.println(date);

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);
        System.out.println(LocalTime.of(1, 1));
        System.out.println("getHour(): " + localTime.getHour());
        System.out.println("getMinute(): " + localTime.getMinute());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("MAX: " + LocalDate.MAX);
        System.out.println("MIN:" + LocalDate.MIN);
        System.out.println("getYear(): " + localDate.getYear());
        System.out.println("getMonth(): " + localDate.getMonth());
        System.out.println("getMonthValue(): " + localDate.getMonthValue());
        System.out.println("getDayOfMonth(): " + localDate.getDayOfMonth());
        System.out.println("getDayOfWeek(): " + localDate.getDayOfWeek());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("MAX: " + LocalDateTime.MAX);
        System.out.println(LocalDateTime.of(localDate, localTime));
        System.out.println(LocalDateTime.of(1,1,1,1,1));

    }
}