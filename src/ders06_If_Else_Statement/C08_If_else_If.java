package ders06_If_Else_Statement;

import java.util.Scanner;

public class C08_If_else_If {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // kenar uzunluklari 0 veya negatifse gecersiz kenar uzunlugu yazdirin
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

    Scanner scan=new Scanner(System.in);
        System.out.println("3 kenar uzunlugu girin");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();
        if (kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("gecersiz kenar uzunlugu");
        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("bu bir eskenar ucgendir");
        } else System.out.println("eskenar ucgen degildir");


        double not=50.7;
        if (not>=85){
            System.out.println("dereceniz AA'dır " );
        } else if (not>=65){
            System.out.println("dereceniz BB'dir");
        } else if (not>=50){
            System.out.println("dereceniz CC'dir");
        } else {
            System.out.println("dereceniz DD'dir");
        }
        }





    }

