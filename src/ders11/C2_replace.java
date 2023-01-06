package ders11;

public class C2_replace {
    public static void main(String[] args) {
         String str="java cok kandır";
        System.out.println(str.replace("", "_"));
        System.out.println(str.replaceFirst("a", "A"));
        System.out.println(str.replace("cok", "tok")
                           .replace("kandır", "bandır"));
        System.out.println(str.replace("a", ""));
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("kandır", "candır"));
        str=str.replace("kandır", "candır");
        System.out.println(str);
    }
}
