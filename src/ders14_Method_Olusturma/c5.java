package ders14_Method_Olusturma;

public class c5 {
    public static void main(String[] args) {
      /*
    Soru 1- Kullanicidan input olarak bir String alin,
    baslangic ve bitis indexlerine gore baslangic index'i dahil, bitis index'i haric olacak sekilde
    aradaki harfleri yazdiran bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */
        String input = "Java ne kadar guzel";
        int basIndexi=0;
        int bitIndexi=18;
        kendimizinMethodu(input,basIndexi,bitIndexi); //

        kendimizinMethodu("java cok gicik", 0, 10);
   }
   public static void kendimizinMethodu(String input, int basindex, int bitindex){
        if (basindex>bitindex){
            System.out.println("hatalı giris yaptiniz");
        } else if(bitindex>=input.length()){
            System.out.println("Bitis indexi String'in sinirlari disinda");

            }else{
                for (int i =basindex; i <bitindex ; i++) {
                    System.out.print(input.charAt(i));
                    
                }
            System.out.println("");
            }
        }



}
