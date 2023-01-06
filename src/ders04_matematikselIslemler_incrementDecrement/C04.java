package ders04_matematikselIslemler_incrementDecrement;

public class C04 {
    public static void main(String[] args) {
        // kullanicinin girdigi 4 basamakli bir sayinin
        // rakamlar toplamini veren bir kod yaziniz
        //System.out.println(84%6);
        int sayi=2523;
        int birlerBasamagi=0;
        int toplam=0;
    birlerBasamagi=sayi%10;
    toplam=toplam+birlerBasamagi;
    sayi=sayi/10;
        birlerBasamagi=sayi%10;
        toplam=toplam+birlerBasamagi;
        sayi=sayi/10;
        birlerBasamagi=sayi%10;
        toplam=toplam+birlerBasamagi;
        sayi=sayi/10;
        birlerBasamagi=sayi%10;
        toplam=toplam+birlerBasamagi;
        sayi=sayi/10;
        System.out.println(toplam);
    }
}
