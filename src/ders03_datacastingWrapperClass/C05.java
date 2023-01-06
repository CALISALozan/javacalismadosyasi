package ders03_datacastingWrapperClass;

public class C05 {
    public static void main(String[] args) {
      Character krk='b';
        System.out.println(krk.charValue());
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetter('b'));
        String str1="1234";
        String str2="5678";
        System.out.println(str1+str2);
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));
    }
}
