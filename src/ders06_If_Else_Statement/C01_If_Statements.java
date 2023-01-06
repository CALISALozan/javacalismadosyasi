package ders06_If_Else_Statement;

import java.util.Scanner;

public class C01_If_Statements {
    public static void main(String[] args) {
       //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.                                         NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        char ilkHarf=scan.next().charAt(0);

        if (ilkHarf== 'o'|| ilkHarf=='O'){
            System.out.println("Ocak");
        }

        if (ilkHarf== 'm'|| ilkHarf=='M'){
            System.out.println("Mart or Mayis");
        }

        if (ilkHarf== 'n'|| ilkHarf=='N'){
            System.out.println("Nisan");
        }

        if (ilkHarf== 'h'|| ilkHarf=='H'){
            System.out.println("Haziran");
        }

        if (ilkHarf== 't'|| ilkHarf=='T') {
            System.out.println("Temmuz");
        }

        if (ilkHarf == 'a' || ilkHarf == 'A') {
            System.out.println("Agustos or Aralik");
        }

        if (ilkHarf == 'e' || ilkHarf == 'E') {
            System.out.println("Eylul or Ekim");
        }

        if (ilkHarf == 'k' || ilkHarf == 'K') {
            System.out.println("Kasım");
        }


    }


}


