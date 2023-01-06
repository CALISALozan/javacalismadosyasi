package ders28;



public class c02 {
    public static void main(String[] args) {
       topla(234,345);
       topla(432,534,232);
       topla(12,323,43434,3232);
    }

    public static void topla(int... sayilar){
        int toplamSonucu=0;
        for (int each : sayilar
             ) {
            toplamSonucu+=each;
        }
        System.out.println("girilen sayilarin toplami: " + toplamSonucu);
    }

}
