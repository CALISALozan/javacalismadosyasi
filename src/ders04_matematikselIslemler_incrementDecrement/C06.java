package ders04_matematikselIslemler_incrementDecrement;

public class C06 {
    public static void main(String[] args) {
        int x= 3;
        int y = 2 * ++x ;
        int z= 5 + y-- ;
        System.out.println(x+y+z);
        int a=10;
        int b=a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(""+'a'+'c'+'4');
    }
}
      /*
      x4
      y7
      z 13
       */

