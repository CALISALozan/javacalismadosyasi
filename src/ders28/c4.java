package ders28;

public class c4 {
    public static void main(String[] args) {
     StringBuilder sb=new StringBuilder(7);
        System.out.println(sb.capacity());
        sb.append("java");
        System.out.println(sb.length());
        sb.append(" guzeldir.");
        System.out.println(sb);
        System.out.println(sb.length());


    }
}
