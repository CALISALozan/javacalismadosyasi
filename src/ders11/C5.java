package ders11;

public class C5 {
    public static void main(String[] args) {
// Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin
        String cumle= "eve geldim, ipler birikdi";
        if (cumle.contains("ev")&& cumle.contains("is")) System.out.println("hem ev lazım hem is");
       else if (cumle.contains("ev")) System.out.println("home home sweet home");
       else if (cumle.contains("is")) System.out.println("calismak guzeldir");
       else if (!(cumle.contains("ev")&& cumle.contains("is"))) System.out.println("cok calisman lazim");

    }
}
