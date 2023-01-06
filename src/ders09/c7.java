package ders09;

public class c7 {
    public static void main(String[] args) {
        String isim= "huseYIN";
        // verilen ismi ilk harfi buyuk, geriye kalanlar kucuk harf olarak kaydedin
        System.out.println(isim.substring(0).toUpperCase());
        System.out.println((isim.substring(0,1).toUpperCase())+ (isim.substring(1,7).toLowerCase()));
    }
}
