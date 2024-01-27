package dates;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today : " + today);

        LocalDate tomorrow = LocalDate.of(2023, 11, 20);
        System.out.println("Tomorrow : " + tomorrow);

        LocalDate yearDay = LocalDate.ofYearDay(2023, 333);
        System.out.println("YearDay : " + yearDay);

        //get values from localdate

        System.out.println("getMonth : " + today.getMonth());
        System.out.println("getMonthvalue : " + today.getMonthValue());
        System.out.println("getDayOfWeek : " +today.getDayOfWeek());
        System.out.println("getDayOfMonth : " +today.getDayOfMonth());
        System.out.println("getDayOfYear : " + today.getDayOfYear());
        System.out.println(today.get(ChronoField.DAY_OF_MONTH));

        //Modeifying local date3

        System.out.println("plusDays : " + today.plusDays(2));
        System.out.println("plusMonths : " + today.plusMonths(2));
        System.out.println("minusDaye : " + today.minusDays(2));
        System.out.println("withyear : " + today.withYear(2021));
        System.out.println("with Chronofield : " + today.with(ChronoField.YEAR, 2020));
        System.out.println("with TemporalAdjusters : " + today.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("minus 1 year : " + today.minusYears(1));
        System.out.println("chronounit minus year : " + today.minus(10, ChronoUnit.YEARS));
        System.out.println("chronounit minus month : " + today.minus(1, ChronoUnit.MONTHS));


        //additional support methods

        System.out.println("leapyear : " + today.isLeapYear());
        System.out.println("leapyear 2012 : " + LocalDate.ofYearDay(2012, 19).isLeapYear());
        System.out.println("isequal : " + today.isEqual(tomorrow)); //false
        System.out.println("today : " + today + " " + "tomorrow : " + tomorrow);
        System.out.println("isafter : " + today.isBefore(tomorrow));
        System.out.println("isBefore : " + tomorrow.isAfter(today));

        //unsupported
        //System.out.println("Not Supported : " + today.minus(1, ChronoUnit.MINUTES));
             // throws UnsupportedTemporalTypeException
        System.out.println("isSupported : " + today.isSupported(ChronoUnit.MINUTES)); //false



    }
}
