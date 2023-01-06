package ders19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c7_yenielementekleme {
    public static void main(String[] args) {

        int[] arr= {2,4,6};

        // bu arr'e 4.bir element olarak 8 ekleyelim
        int [] arr2={2,4,6,8};
        arr=arr2;
        System.out.println(Arrays.toString(arr));
        int arr3[] =new int[arr.length+1];
        System.out.println(Arrays.toString(arr3));
        arr=arr3;
        System.out.println(Arrays.toString(arr));



    }

}
