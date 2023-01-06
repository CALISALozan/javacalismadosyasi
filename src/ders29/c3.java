package ders29;

public class c3 {


    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java ne kadar guzeldir.");
        int total=0;
        total+=sb1.substring(6,9).length();
        System.out.println(total);
    }

}

