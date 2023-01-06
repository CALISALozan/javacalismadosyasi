package ders18;

import java.util.Arrays;

public class c2_arrays {
    public static void main(String[] args) {
        String [] arr={"Ali","Ulus","Nesrin"};

        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("");
        System.out.print(Arrays.toString(arr));
    }
}
