package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println(isim.toUpperCase());
    }
}
