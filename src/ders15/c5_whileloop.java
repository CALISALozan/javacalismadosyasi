package ders15;

import java.util.Scanner;

public class c5_whileloop {
    public static void main(String[] args) {
                /*
          Kullanicidan toplanmak uzere sayi alin
          sayilarin toplami 500'e esit olur veya gecerse
          girilen sayi adedi,
          girilen sayilarin toplamini ve
          "Bu kadar yeter" yazdirin
         */
        Scanner scan=new Scanner(System.in);
       double girilensayi=0;
       double toplam=0;
       int sayac=0;


        while (toplam<=500){
            System.out.println("Lutfen toplanmak uzere sayilar girin");
            girilensayi=scan.nextDouble();
        toplam=toplam+girilensayi;
        sayac++;
        }
        System.out.println("Girilen " + sayac+ " sayinin toplami :" + toplam+ " oldu. Bu kadar yeter");
    }
}
