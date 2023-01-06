package ders07;

import java.util.Scanner;

public class c1_ifelse {
    public static void main(String[] args) {
        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kg olarak kilonuzu giriniz");
        double kilo=scan.nextDouble();
        System.out.println("boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble();

        double vke =((kilo*10000) / (boy *boy));
        System.out.println("vücut kitle endeksiniz: " + vke);
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.
        if (vke>30) {
            System.out.println("obezsiniz");
        } else if (vke>25) {
            System.out.println("kilolusunuz");
        } else if (vke>20) {
            System.out.println("normalsiniz");
        } else if (vke>0) {
            System.out.println("zayifsiniz");

        }else {
            System.out.println("geçersiz giriş");

    }


    }
}
