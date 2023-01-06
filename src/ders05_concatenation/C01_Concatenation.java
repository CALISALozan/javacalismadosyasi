package ders05_concatenation;

public class C01_Concatenation {
    public static void main(String[] args) {
        String s1= "Java";
        String s2= "Guzeldir";
        String s3= ""; // hiclik
        String s4= " "; // space, bosluk

        int sayi1= 4;
        int sayi2= 3;



        // Java Guzeldir 12
        System.out.println(s1+s4+s2+s4+(sayi1*sayi2));
        System.out.println(s1+s4+s2+s4+sayi1*sayi2); // Java Guzeldir 12
        int a=10;
        int b=15;
        boolean c;
        c=15>=b;
        System.out.println(c);
       // System.out.println(a>b-6 && b>0);
    }
}
