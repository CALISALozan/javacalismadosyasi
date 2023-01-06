package ders21;

import java.util.ArrayList;
import java.util.List;

public class c1_element_ekleme {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        System.out.println(sayilar.add(10));
        System.out.println(sayilar);
        System.out.println(sayilar.add(20));
        System.out.println(sayilar);
        sayilar.add(1,15);
        System.out.println(sayilar);
        sayilar.add(0,44);
        System.out.println(sayilar);
        List<Integer> eklenecekliste=new ArrayList<>();
        eklenecekliste.add(3);
        eklenecekliste.add(5);
        sayilar.addAll(eklenecekliste);
        System.out.println(sayilar);
        sayilar.addAll(1,eklenecekliste);
        System.out.println(sayilar);

    }
}
