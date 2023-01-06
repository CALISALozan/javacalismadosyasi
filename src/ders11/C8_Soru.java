package ders11;

public class C8_Soru {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        String sifre = "eAdadadaş01234924294278rwjwjoır234220n2342";
        int bayrak = 0;
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk harf olmali");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && (sifre.charAt(sifre.length() - 1) <= '9'))) {
            System.out.println("son karakter rakam olmali");
            bayrak++;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            bayrak++;

        }
        if (!(sifre.length() >= 10)) {
            System.out.println("sifre en az 10 karakter olmalı");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("sifreniz basarıyla kaydedildi");
        }

    }
}
