package ders27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class c6_LocalDateTime {

    public static void main(String[] args) {


        LocalDateTime zaman=LocalDateTime.now();
        System.out.println(zaman.getDayOfWeek());
        LocalDate bugun=LocalDate.now();
        LocalDate dogumgunu=LocalDate.of(1977,04,17);
        Period gecenSure=Period.between(dogumgunu, bugun);
        System.out.println(gecenSure);

        LocalDate cikis=LocalDate.of(1977,04,17);
        Period fark=Period.between(dogumgunu, bugun);
        System.out.println(gecenSure);

    }
}
