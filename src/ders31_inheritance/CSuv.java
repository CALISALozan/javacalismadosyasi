package ders31_inheritance;

import java.util.Arrays;

public class CSuv extends BinekArac {
    public static void main(String[] args) {
        CSuv suv1 = new CSuv();
        System.out.println(suv1.marka);
        System.out.println(suv1.motor);
        CSuv suv2 = new CSuv();
        suv2.marka = "Toyota";
        suv2.model = "Rav4";
        suv2.motor = "1.6";
        suv2.plaka = "06 ANK 006";
        suv2.yakit = "Benzin";
        suv2.yil = 2012;
        suv2.hiz(suv2.yakit);


    }

    public void hiz(String yakit) {

        if (yakit.equalsIgnoreCase("benzin")) {
            System.out.println("Benzinli SUV'ler max 300 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Dizel SUV'ler max 260 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Hibrit SUV'ler max 220 km hiz yapar");
        } else {
            System.out.println("yakit belli degil, max hiz soyleyemem");
        }
    }
}
