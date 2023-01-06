package ders08;

public class c1_ternary {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin
        // sayi pozitif ise 2 katini yazdirin
        // sayi pozitif degilse sayiya 10 ekleyip yazdirin

        int sayi = -98;
        System.out.println(sayi>0? sayi*2:sayi+10);
    }
}