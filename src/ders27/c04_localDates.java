package ders27;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;

public class c04_localDates {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.minusDays(100));
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.isLeapYear());
        System.out.println(tarih.withYear(1994).isLeapYear());


    }
}
