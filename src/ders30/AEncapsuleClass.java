package ders30;

public class AEncapsuleClass {
    private String hastaneIsmi="Yildiz hastanesi";
    private int hastaucreti;

     private String hemsireIsmi;
     private String hemsireAdresi;

    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }

    public void setHastaucreti(int hastaucreti) {
        this.hastaucreti = hastaucreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }
}
