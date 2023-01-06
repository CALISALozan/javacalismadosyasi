package ders08;

public class c2 {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ALI";

        // verilen iki metin birbiri ile ayni ise "metinler ayni"
        // farkli ise "metinler farkli" yazdirin
        System.out.println(str1.equals(str2) ? "ayni" : "farklı");
    }
}
