package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin(swap).
    Scanner scan=new Scanner(System.in);
    int boskova=0;

        System.out.println("lutfen 2 sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
     boskova=   sayi1;
     sayi1=sayi2;
    sayi2=boskova;
        System.out.println("birinci sayi:   " + sayi1);
        System.out.println("ikinci sayi:   " + sayi2);






    }
}
