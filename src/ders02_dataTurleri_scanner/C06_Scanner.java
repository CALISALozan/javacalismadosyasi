package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("dikdortgenin uzun kenar uzunlugunu giriniz");
        double uzunKenar=scan.nextDouble();
        System.out.println("dikdortgenin kisa kenar uzunlugunu giriniz");
        double kisaKenar=scan.nextDouble();
        System.out.println("dikdortgenin alani  :" + uzunKenar*kisaKenar + "  metrekaredir");
    }
}
