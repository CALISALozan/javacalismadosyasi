package ders15;

import java.util.Scanner;

public class c4_while {
    public static void main(String[] args) {
                /*
        Kullanicidan toplanmak uzere tamsayilar alin
        kullanici 0'a basarsa sayi alma islemini bitirin
        kullanicinin kac sayi girdigini
        ve bu sayilarin toplaminin kac oldugunu yazdirin
         */
    Scanner scan=new Scanner(System.in);
    int girilenSayi=5;
    int sayac=0;
    int toplam=0;
    while (girilenSayi!=0){
        System.out.println("Lutfen toplamak icin tamsayi girin"+
                "\nBitirmek ici 0'a Basin");
        girilenSayi=scan.nextInt();
        if (girilenSayi!=0){
            sayac++;
            toplam=toplam+girilenSayi;
        }

        }
    System.out.println("Girilen" +sayac+ " adet sayinin toplami:"+toplam);
    }
}
