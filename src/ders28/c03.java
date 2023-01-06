package ders28;

public class c03 {
    public static void main(String[] args) {
        method1(3, 4, 5, 6, 7, 8);

    }


    public static void method1(int... sayilar) {
        int toplamSonucu=0;
        for (int each : sayilar
        ) {
            toplamSonucu+=each;
        }
        System.out.println("girilen sayilarin toplami: " + toplamSonucu);

    }

}