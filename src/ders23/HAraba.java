package ders23;

public class HAraba {
    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;
public HAraba(String mrk, String mdl, String ykt, int yl, int fyt){

}
public HAraba(){

}

    @Override
    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;


    }

    public int maxHiz(String yakit){
        int maxHiz=120;

        if(yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }

}
