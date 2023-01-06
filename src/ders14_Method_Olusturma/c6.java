package ders14_Method_Olusturma;

public class c6 {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan main method icinde
        // ayri ayri isim ve soyismini alin
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        // isim bosluk soyisim seklinde bize donduren bir method olusturun
        // input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

        String isim="OMER";
        String soyisim= "kesen";
        System.out.println(isimSoyisimDuzenle(isim, soyisim));
        System.out.println(isimSoyisimDuzenle("yavuz", "sultan"));


    }
    public static String isimSoyisimDuzenle(String isim, String soyisim){
         String yeniIsimSoyisim= (isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase() +
                 " "
                 + soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());


        return yeniIsimSoyisim;
    }
        }

