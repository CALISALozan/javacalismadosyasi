package ders14_Method_Olusturma;

public class c3 {
    // parametre olarak bir String kabul edip
    // String'in terse cevrilmis halini döndüren bir method olusturun

    public static void main(String[] args) {
        String input= "java kod yazdikca ogrenilir";


        System.out.println(tersineCevir(input));
        System.out.println(tersineCevir("manyakmisin kardesim sen"));


    }

    public static String tersineCevir(String input) {
        String tersinput="";
        for (int i =input.length()-1; i >=0 ; i--) {
            tersinput=tersinput + input.charAt(i);

        }
        return tersinput;
    }

}
