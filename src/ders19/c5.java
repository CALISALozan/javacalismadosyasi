package ders19;

import java.util.Arrays;

public class c5 {
    public static void main(String[] args) {

        String str="Java gercekten cok cok guzel";
        //verilen string te kac tane e harfi oldugunu bulunuz
        String[] earray=str.split("e");
        System.out.println(Arrays.toString(earray));
        System.out.println(earray.length);


        System.out.println(Arrays.toString(str.split("")));


        String [] tumKarakterlerarr=  str.split("");
        System.out.println(Arrays.toString(tumKarakterlerarr));
        int sayac=0;
        //{J, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l}
        for (int i = 0; i <tumKarakterlerarr.length ; i++) {
           if (tumKarakterlerarr[i].equals("e")){
               sayac++;

           }



        }
        System.out.print("metindeki e sayisi: "+ sayac);



    }
}

