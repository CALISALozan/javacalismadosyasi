package ders21;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c8_kullaniciyaListOlusturma {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(listeOLustur());


    }
    public static List<String> listeOLustur(){
        List<String> isimler=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        String girilenIsim="";
        while (!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("lutfen listeye eklemek icin isim giriniz"+
                               "\nbitirmek için q ya basin");
            girilenIsim=scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }


        }




return isimler;
    }


}
