package ders13;

public class c2 {
    public static void main(String[] args) {
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input= "Java her gecen gun guzellesiyor";
        String tersinput="";
        for (int i =input.length()-1; i >=0 ; i--) {


            tersinput=tersinput+input.substring(i, i+1);



        }
        System.out.println("tersinput:"  + tersinput);
    }
}
