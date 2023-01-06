package ders05_concatenation;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        /*int a=10;
        int b=20;
        if (a>b) System.out.println("a b den buyuktur");
        if(a<100) System.out.println("a 100 den kucuk");
        if (b>0) System.out.println("b sıfırdan buyukmus ya la ");
        // kullanicidan iki tamsayi alin
        // eger birinci sayi 100'den buyukse , "ilk sayi 100'den buyuk" yazdirin
        // eger ikinci sayi ciftse, "ikinci sayi cift yazdirin"
        // eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk" yazdirin*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 tamsayi giriniz");
        int ilkSayi=scan.nextInt();
        int ikinciSayi=scan.nextInt();
       int bayrak=0;
        if (ilkSayi>100) System.out.println("İlk sayi 100 den buyuk");
        bayrak++;
        if (ikinciSayi%2==0) System.out.println("ikinci sayi cifttir");
        bayrak++;
        if (ilkSayi>ikinciSayi) System.out.println("ilk sayi ikinci sayidan büyükmüş ya len");
        bayrak++;
        if (bayrak==0) System.out.println("noluyo len.");
        System.out.println(bayrak);

    }
}
