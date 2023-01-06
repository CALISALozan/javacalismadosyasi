package ders23;

public class DarabaRunner {
    public static void main(String[] args) {

    DAraba arb1=new DAraba();
        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);

        arb1.marka="tofas";
        arb1.model="kartal";
        arb1.yakit="benzin";
        arb1.fiyat=50000;
        arb1.maxHiz(arb1.yakit);
        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);
        DAraba arb2=new DAraba();

        // arb2'nin ozelliklerini yazdirmak istesek

        System.out.println("Marka : " + arb2.marka +
                "\nModel : " + arb2.model+
                "\nYakit : " + arb2.yakit+
                "\nYil : " + arb2.yil+
                "\nFiyat : " + arb2.fiyat);
        DAraba arb3=new DAraba();
        System.out.println(arb3);
        System.out.println(arb1);



    }
}
