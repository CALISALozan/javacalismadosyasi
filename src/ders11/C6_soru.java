package ders11;

public class C6_soru {
    public static void main(String[] args) {
        // Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //	- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //	- esit veya soyisim daha uzun ise
        //    ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        String isim = "MEHMet";
        String soyisim = "HARuNGIL";
        if (isim.length() > soyisim.length()) {
            System.out.println(isim.substring(0, 1).toUpperCase() + (isim.substring(1).toLowerCase())
                    + (soyisim.substring(0, 1).toUpperCase()
                    + soyisim.substring(1).toLowerCase()));
        } else if (isim.length() == soyisim.length() || soyisim.length() > isim.length()) {

        }
    }
}
