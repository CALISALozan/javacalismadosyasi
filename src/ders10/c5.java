package ders10;

public class c5 {
    public static void main(String[] args) {
     /*   mail kontrolu yapan bir program hazirlayin
        1- mail @ isareti icermiyorsa "gecersiz email"
        2- @gmail.com icermiyorsa "gmail adresi giriniz"
        3- @gmail.com ile bitmiyorsa "yazim hatasi"
        seklinde sonuc yazdirin*/

        String email="ozanca1407@gmail.com";
        int bayrak=0;
        if (!(email.contains("@"))){
            System.out.println("gecersiz mail");
            bayrak++;
        } if (!(email.contains("@gmail.com"))){
            System.out.println("gmail adresi giriniz");
            bayrak++;
        } if (!(email.endsWith("@gmail.com"))){
            System.out.println("yazım hatasi yaptınız");
            bayrak++;
        } if (bayrak==0){
            System.out.println("sifreniz basariyla kaydedildi");
        }

    }


}























/*


     /*   if (!email.contains("@")){
            System.out.println("gecersiz mail");

        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!email.endsWith("@gmail.com"))
        {   System.out.println("yazim hatasi");
        }
        if (!email.contains("@")){

            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");

        }else {
            System.out.println("email basari ile kaydedildi");
        }
*/





