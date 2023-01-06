package ders14_Method_Olusturma;

public class c7_asal {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        // Girilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.

        int sayi=43;
        System.out.println(asalSayiKontrol(sayi));


    }
    public static String asalSayiKontrol(int sayi){
        String sonuc="";
        for (int i =2; i <=sayi-1 ; i++) {

            if (sayi%i==0) {
                sonuc="asal değil";
                break;
            }
                }
        if (!sonuc.equals("asal değil")){
            sonuc="asal";
            }
         return sonuc;
        }

    }

