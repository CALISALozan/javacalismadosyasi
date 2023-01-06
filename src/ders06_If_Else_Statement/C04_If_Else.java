package ders06_If_Else_Statement;

import java.util.Scanner;

public class C04_If_Else {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 1 karakter giriniz");
        char krk=scan.next().charAt(0);
        if (krk>='A' && krk<='Z'){
            System.out.println("girilen karakter buyuk harftir");

        } else{
            System.out.println("girilen karakter buyuk harf degildir");
        }





    }
}
