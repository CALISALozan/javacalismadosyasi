package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir double, bir de int sayi giriniz");
        double sayi1=scan.nextDouble();
        int sayi2=scan.nextInt();
        System.out.println("iki sayinin toplamı    :" + (sayi1+sayi2)+
                "\niki sayinin carpimi    :"+ (sayi1*sayi2));





    }
}
