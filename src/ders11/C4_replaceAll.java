package ders11;

public class C4_replaceAll {
    public static void main(String[] args) {
        // Kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        // NOT : space silinmemeli
        String input= "%H2av*(a  co_k 1*guzel";
        System.out.println(input.replaceAll("\\d", ""));
        System.out.println(input.replace(" ", "5"));
        System.out.println(input.replaceAll("\\W", ""));
        System.out.println(input.replaceAll("\\d", ""));
        System.out.println(input.replaceAll(" ", "5"));
        System.out.println(input.replaceAll("\\W", ""));
        System.out.println(input.replaceAll("\\d", ""));
    }
}
