package ders31_inheritance;

public class BinekArac extends Arac {
    protected String marka = " binek araclarin markasi vardir ";
    protected String model = "binek araclarin modeli olur ";
    protected int yil = 1900;

    protected void hiz() {
        System.out.println("binek araclarin hizi modele gore değisir");
    }

    protected void teker() {
        System.out.println("binek araclarin 4 tekeri olur");
    }
}