package ders06_If_Else_Statement;

import java.util.Scanner;

public class C07_If_else {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf=scan.next().charAt(0);
        if (harf>='a' && harf<='z'){
            System.out.println(Character.toUpperCase(harf));
        } else{
            System.out.println(harf);
        }


    }
}
