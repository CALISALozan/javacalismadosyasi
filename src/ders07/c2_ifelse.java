package ders07;

public class c2_ifelse {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin

        int urunAdedi=1;
        boolean kartVarMi=true;
        double listeFiyati= 20;
        double toplamFiyat=0;
        if (urunAdedi>=10 &&kartVarMi) {
            toplamFiyat = urunAdedi * listeFiyati * (0.8);
            System.out.println("%20 indirimli toplam fiyat :" + toplamFiyat);
        } else if (urunAdedi<10 && kartVarMi) {
            toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat :" + toplamFiyat);
        } else if (urunAdedi>=10 && !kartVarMi) {
            toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat :" + toplamFiyat);
        } else if (urunAdedi<10 && !kartVarMi) {
            toplamFiyat = urunAdedi * listeFiyati * (0.90);
            System.out.println("%10 indirimli toplam fiyat :" + toplamFiyat);

        }else {
            System.out.println("geçersiz veri girisi");
        }
    }

    }




