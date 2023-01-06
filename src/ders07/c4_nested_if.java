package ders07;

import java.util.Scanner;

public class c4_nested_if {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        // ana degisken yas olsun
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yaşınızı giriniz");
        double yas = scan.nextDouble();
        System.out.println("lutfen cinsiyetinizi giriniz E/K");
        char cinsiyet = scan.next().charAt(0);
        if (yas < 15) {
            System.out.println("hatalı yaş girişi");
        } else if (yas < 60) {

            System.out.println("emekli olamazsın");
        }
        if (cinsiyet == 'k' || cinsiyet == 'K') {
            System.out.println("emekli olmak için " + (60 - yas) + "daha calısmalısın");
        } else if (cinsiyet == 'E' || cinsiyet == 'e') {
            System.out.println("emekli olmak için " + (65 - yas) + "daha calısmalısın");
        } else {
            System.out.println("geçersiz giriş");
        }


    }
}
