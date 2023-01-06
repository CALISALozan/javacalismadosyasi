package ders11;

public class C3_replaceAll {
    public static void main(String[] args) {
       String str="2Ja3v5a g789u3ze8ld4ir";
        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("\\D", ""));
        System.out.println(str);
        String s1= "ilk urun fiyati : 1250 tl";
        String s2= "ikinci urun fiyati : 1500 tl";
        // iki urunun fiyatini toplayin
        System.out.println((s1.replaceAll("\\D", ""))+
                (s2.replaceAll("\\D", "")));
        s1=s1.replaceAll("\\D",""); // "1250"
        s2= s2.replaceAll("\\D",""); // "1500"
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));


    }
}
