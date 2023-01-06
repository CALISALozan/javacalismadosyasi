package ders19;

import java.util.Arrays;

public class c2 {
    public static void main(String[] args) {
        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int[] arr={3,8,1,12,45,67};

        System.out.println();
        enBuyukenKucukElementYazdir(arr);

    }
public static void enBuyukenKucukElementYazdir(int[] arr){

       Arrays.sort(arr);
    System.out.println("en buyuk element : " + arr[arr.length-1]);
    System.out.println("en kucuk element : " + arr[0]);

}
}
