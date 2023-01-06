package ders06_If_Else_Statement;

import java.util.Scanner;

public class C10_If_else_If {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

       Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        //char cinsiyet='K';
       // int yas=60;
       if (cinsiyet=='E' && yas>=65) {
           System.out.println("emekli olabilirsiniz");
       } else if (cinsiyet=='K'&& yas>=60) {
           System.out.println("emekli olabilirsiniz");
       } else if (cinsiyet=='E' && yas<65) {
           System.out.println("emekli olmak için " + (65 - yas) + " sene daha çalışmalısınız");
       } else if (cinsiyet=='K'&& yas<60) {
           System.out.println("emekli olmak için " + (60 - yas) + " sene daha çalışmalısınız");
       }



       }















}





