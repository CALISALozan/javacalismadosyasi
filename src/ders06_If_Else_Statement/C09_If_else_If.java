package ders06_If_Else_Statement;

import java.util.Scanner;

public class C09_If_else_If {
    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // sayi negatif ise "gecersiz sayi"
        // tek basamakli ise "rakam"
        // iki basamakli ise "iki basamakli sayi"
        // bunun disindaki sayilar icin "buyuk sayi" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi=scan.nextInt();
        if (sayi<0){
            System.out.println("gecersiz sayi");

        } else if (sayi<10){
            System.out.println("rakam");

        } else if (sayi<100){
            System.out.println("iki basamakli sayi");
        } else{
            System.out.println("buyuk sayi");
        }




        }



    }

