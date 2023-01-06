package ders18;

import java.util.Arrays;

public class c1_arrays {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10};
        System.out.println(arr1[2]);
        arr1[3]=20;
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[3]);
        System.out.println(arr1[arr1.length-1]);

    }
}