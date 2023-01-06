package ders17;

public class c4_objectVariables {
    public static void main(String[] args) {

        System.out.println(C03_ObjectVariables.hastaneismi); // Yildiz hastanesi

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23453

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();



        System.out.println(C03_ObjectVariables.hastaSayisi); // 23456


    }

        public static void method1(){
        C03_ObjectVariables.hastaSayisi++;

    }





}



