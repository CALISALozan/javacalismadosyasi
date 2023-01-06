package ders08;

public class c3 {
    public static void main(String[] args) {
        int a= 5;
        String sonuc= a%2==0? "çift sayi":"teksayi";
        //System.out.println(a%2==0? "çift sayi":"teksayi");
        String sonuc2= a>10 ? "buyuk sayi" :""+(2*a) ;
        System.out.println(a>10 ? "buyuk sayi" :(2*a));
    }
}
