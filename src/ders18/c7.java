package ders18;

public class c7 {
    public static void main(String[] args) {
        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
String arr[]={"hadfgdfgdsan", "addgdfgdfem", "sentwrwrwerwurk", "omeer faruk"};

enUzunEnKisaIsimleriYazdir(arr);
    }
    public static void enUzunEnKisaIsimleriYazdir(String[] arr){
     String enuzunkelime=arr[0];
     String enkisakelime=arr[0];

        for (int i =1; i <arr.length ; i++) {
            if (arr[i].length()>enuzunkelime.length()){
                enuzunkelime=arr[i];
            }
            if (arr[i].length()<enkisakelime.length()){
                enkisakelime=arr[i];
            }

        }

        System.out.println("en uzun kelime "+ enuzunkelime);
        System.out.println("en kisa kelime "+ enkisakelime);


    }


}
