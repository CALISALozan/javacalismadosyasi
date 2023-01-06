package ders16;

public class c2_do_while{
    public static void main(String[] args) {
        // 10 11 12 sayilarini toplayan bir while loop oluşturalim.
        int sayi=10;
        int toplam=0;
        do {
           toplam=toplam+sayi;
            sayi++;
        }while (sayi<=12);
    }

}
