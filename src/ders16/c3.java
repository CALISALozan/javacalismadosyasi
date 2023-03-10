package ders16;

import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
                /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
	    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
	    ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
		- Sifre kucuk harf icermelidir
		- Sifre buyuk harf icermelidir
		- Sifre ozel karakter icermelidir
		- Sifre en az 8 karakter olmalidir.
           SADECEa54
         */
        Scanner scan = new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifreDogruMu;

        do {
            System.out.println("lutfen bir sifre giriniz");
            sifre = scan.nextLine();
            bayrak = 0;
            int sonuc = kucukHarfKontroluYap(sifre);
            bayrak=bayrak+sonuc;
            sonuc=buyukHarfKontroluYap(sifre);
            bayrak=bayrak+sonuc;
            sonuc=ozelKarakterKontroluYap(sifre);
            bayrak=bayrak+sonuc;
            if (sifre.length()<8) {
                System.out.println("sifre en az 8 karakter olmalıdır");
            }else {
                bayrak++;

            }
        }while (bayrak!=4);
        System.out.println("sifreniz basariyla kaydedildi");
    }

   public static int ozelKarakterKontroluYap(String sifre) {
       int bayrak=0;
       String ozelKarakterler="§±@!$%^&*()_-+=?/>.<,`~#";

       for (int i = 0; i <sifre.length() ; i++) {
           if(ozelKarakterler.contains(sifre.substring(i,i+1))){
           bayrak++;
           break;

           }
       }
       if (bayrak==0){
           System.out.println("sifre ozel karakter icermelidir");
           return 0;
       }else return 1;
    }



    public static int buyukHarfKontroluYap(String sifre) {
        int bayrak=0;
        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                bayrak++;
                break;



            }

        }

        if (bayrak==0){
            System.out.println("sifre buyuk harf icermelidir");
            return 0;
        }else return 1;

    }

    public static int kucukHarfKontroluYap(String sifre) {
        int bayrak=0;
        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                bayrak++;
                break;



            }

        }

        if (bayrak==0){
            System.out.println("sifre kucuk harf icermelidir");
            return 0;
        }else return 1;
    }

}
