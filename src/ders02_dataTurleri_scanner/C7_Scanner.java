package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C7_Scanner {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("isminiz   : "+isim+
                          "\nsoyisminiz: "+soyisim+
                           "\nyasiniz   :"+yas+ "\nkaydiniz basariyla tamamlanmıştır");



    }
}
