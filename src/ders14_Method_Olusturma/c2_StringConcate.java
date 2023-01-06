package ders14_Method_Olusturma;

public class c2_StringConcate {
    // verilen iki String'i parametre olarak kabul edip
    // bu iki String'i aralarinda bir bosluk olan tek bir String olarak
    // main method'a donduren bir method olusturun



    public static void main(String[] args) {
        String str1="Java";
        String str2="Candir";
        System.out.println(birlestirMethodu(str1, str2));


    }

    public static String birlestirMethodu(String str1, String str2) {
        String birlesmisHali= str1+str2;
    return str1+ " "+ str2;
    }
}