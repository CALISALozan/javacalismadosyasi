package ders08;

public class c6_switchcase {
    public static void main(String[] args) {
        // Kullanicinin girdigi gun numarasinin
        // gun ismini yazdirin
      //  int gun=7;
      /*  if (gun==1){
            System.out.println("pazartesi");
        }else if(gun==2){
            System.out.println("sali");
        } else if(gun==3){
            System.out.println("carsamba");
        }else if(gun==4){
            System.out.println("persembe");
        }else if(gun==5){
            System.out.println("cuma");
        }else if(gun==6){
            System.out.println("cumaertesi");
        }else if(gun==7){
            System.out.println("pazar");
        }else {
            System.out.println("geçersiz giris");
        }
*/  int gun=2;
      switch (gun) {
          case 1:
              System.out.println("pazartesi");
              break;
          case 2:
              System.out.println("sali");
              break;
          case 3:
              System.out.println("carsamba");
          case 4:
              System.out.println("persembe");
              break;
          case 5:
              System.out.println("cuma");
              break;
          case 6:
              System.out.println("cumartesi");
              break;
          case 7:
              System.out.println("pazar");
              break;
          default:
              System.out.println("geçesiz giris");
      }









    }
}
