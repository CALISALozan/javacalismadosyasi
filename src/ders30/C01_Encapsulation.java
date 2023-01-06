package ders30;

public class C01_Encapsulation {
    public static void main(String[] args) {
       AEncapsuleClass pers1=new AEncapsuleClass();
       // pers1.hastaneadi="Java Hastanesi";
        //pers1.hastaucreti=10000;
       // pers1.hemsireAdresi="Ankara";
        // pers1.hemsireIsmi="Yildiz Yildiz";
        System.out.println(pers1.getHastaneIsmi());
        pers1.setHastaucreti(500);

    }
}
