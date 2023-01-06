package ders09;

public class c6 {
    public static void main(String[] args) {
        String str= "Java ogren, isi kap";
        System.out.println(str.substring(str.length()-1).toUpperCase());
        String isim="abdurrezzakkıllıkenan";
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        System.out.println(isim);
        String str2="huseyin";
        System.out.println(str2.substring(3,4));
    }
}
