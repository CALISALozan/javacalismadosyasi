package ders21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c9_fibonacci {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan pozitif bir tamsayi alip,
        //         o tamsayidan kucuk Fibonacci sayilarini bir liste olarak
        //          yazdirin
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 .....
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int girilenSayi=scan.nextInt();

        if (girilenSayi<0){
            System.out.println("fibonacci serisi icin 0'dan buyuk tamsayi girmelisiniz");
        } else if (girilenSayi==0){
            System.out.println("sıfırdan kucuk fibonacci sayisi yoktur");
        } else if (girilenSayi==1) {
            System.out.println("1'den kucuk tek fibonacci sayisi vardir  : 0");
        }else{
            fibonacciSayilariniYazdir(girilenSayi);

        }

    }

    public static void fibonacciSayilariniYazdir(int girilenSayi) {
        List<Integer> fibonacciListesi=new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);
        int yeniFibonacciSayisi=0;
        int index=3;
        while (yeniFibonacciSayisi<girilenSayi){
            yeniFibonacciSayisi=fibonacciListesi.get(index-2)+fibonacciListesi.get(index-1);
        if (yeniFibonacciSayisi<girilenSayi){
            fibonacciListesi.add(yeniFibonacciSayisi);

        }
        index++;


    }
        System.out.println(fibonacciListesi);

}
}
