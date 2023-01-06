package ders08;

import java.util.Scanner;

public class c7 {
    public static void main(String[] args) {
        // J : Java
        // D : Devolepment
        // K : Kit
        // Kullanicidan bir harf alin
        // alinan harf J, D, K 'dan biri ise yukaridaki kelimeleri yazdirin
        // bu harflerden biri degilse "Gecersiz harf" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf= scan.next().charAt(0);
        switch (harf){
            case 'j':
            case 'J':
                System.out.println("Java");
        break;
        case 'd' :
        case 'D' :
            System.out.println("development");
            break;
            case 'k' :
            case 'K' :
                System.out.println("KIT");
                break;
            default:
                System.out.println("gecersiz harf");

        }
    }
}
