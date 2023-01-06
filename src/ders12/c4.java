package ders12;

public class c4 {
    public static void main(String[] args) {
        // kullanicinin verdigi sayinin rakamlar toplamini bulun
         int sayi=1453;
         int birlerbasamagi=0;
         int rakamlartoplami=0;
        for (int i = 1; i <=4 ; i++) {
    birlerbasamagi=sayi%10;
    rakamlartoplami=rakamlartoplami+birlerbasamagi;
    sayi=sayi/10;

        }
        System.out.println(rakamlartoplami);
    }
}
