package ders21;

import java.util.ArrayList;
import java.util.List;

public class c2_Toplu_Eleman_ekleme {
    public static void main(String[] args) {
        List<String> harfler= new ArrayList<>();
        String[] arr = {"a","e","i","o","u"};

       for (int i = 0; i < arr.length ; i++) {
            harfler.add(arr[i]);

        }
        System.out.println(harfler);
        System.out.println(harfler.size());
        System.out.println(harfler.isEmpty());
    }
}
