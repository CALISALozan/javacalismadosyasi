package ders06_If_Else_Statement;

import java.util.Scanner;

public class C05_If_Else {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

    Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas>=65){
            System.out.println("hadi yine iyisin, emekli olabilirsiniz");
        }else {
            System.out.println("emekli olmak icin " + (65-yas) + " sene daha calismalisin");
        }


    }
}