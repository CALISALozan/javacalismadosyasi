package ders06_If_Else_Statement;

import java.util.Scanner;

public class C02_If_Statement {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.
    Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 tane kenar uzunlugu giriniz");
        int kenarUzunlugu1=scan.nextInt();
        int kenarUzunlugu2=scan.nextInt();
        int kenarUzunlugu3=scan.nextInt();
        if (kenarUzunlugu1==kenarUzunlugu2 && kenarUzunlugu2==kenarUzunlugu3){
            System.out.println("bu bir eskenar ucgendir");

        }

    }
}
