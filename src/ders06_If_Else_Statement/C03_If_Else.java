package ders06_If_Else_Statement;

import java.util.Scanner;

public class C03_If_Else {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 tane kenar uzunlugu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();
        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("bu bir eskenar ucgendir");
        } else {
            System.out.println("eskenar ucgen degil");
        }
    }
}