package ders29;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class c1 {
    public static void main(String[] args) {
        LocalDateTime zaman=LocalDateTime.now();
        System.out.println(zaman);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(zaman.format(dtf1));
    }
}
