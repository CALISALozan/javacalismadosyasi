package ders19;

import java.util.Arrays;

public class c6 {
    public static void main(String[] args) {



        String [] arr1={"Ali","Veli"};
        String [] arr2={"A","B","C"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));
        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));
       //  arr1={"dfsdf", "adadas"};

    }
}
