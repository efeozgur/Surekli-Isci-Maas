public class Main {
    public static void main(String[] args) {
        
        /*
        *Objeler oluşturuluyor
        */
        Hesaplamalar hesap = new Hesaplamalar("22174525110", "Akın ORTAŞ", "Evli", "TR370001500158007297620549", "Sürekli İşçi", false, true, 2);
        Gun gun = new Gun(21,21,9,30);  
        AylikSosyalYardimlar asy = new AylikSosyalYardimlar();
        YillikSosyalYardimlar ysy = new YillikSosyalYardimlar();
        OlayaBagliYardimlar oby = new OlayaBagliYardimlar();
        
        // objeler oluşturuldu
        
        
        // setler ayarlanıyor
        
        //oby.setEvlenmeYardimi(true);
        hesap.setBrutUcret(4);
        hesap.setGunlukUcret(gun);
        asy.setYemekYardimi(gun);
        asy.setCocukYardimi(hesap);
        asy.setYakacakYardimi(30);
        
        
        
        //setler ayarlandı
        
        

        System.out.println("Günlük Ücret : " + hesap.getGunlukUcret());
        System.out.println("Yemek Yardımı : " + asy.getYemekYardimi());
        System.out.println("Çocuk Yardımı : " + asy.getCocukYardimi());
        System.out.println("Yakacak Yardımı : "+ asy.getYakacakYardimi());
        System.out.println("SGK Matrahı : " + hesap.SGK_Matrahi(asy));
        System.out.println("SGK %20.5 İşveren payı :"+ hesap.sgk20());
        System.out.println("SGK %14 Kişi payı :"+ hesap.sgk14());
        System.out.println("İşsizlik İşveren Sigorta Primi :"+ hesap.sgk2());
        System.out.println("İşsizlik Sigorta Primi :"+ hesap.sgk1());
        System.out.println("Gelir Vergisi Matrahı :"+ hesap.gvMatrahi());
        System.out.println("ASGARİ GEÇİM İNDİRİMİ : "+AGI.agiYolla(AGILER.EVLI_ESI_CALISMAYAN_2_COCUKLU));
        System.out.println("Gelir Vergisi : " + hesap.gelirVergisi(15, AGILER.EVLI_ESI_CALISAN_2_COCUKLU));
        System.out.println("Damga Vergisi : " + hesap.damgaVergisi(asy, ysy));
        System.out.println("Hakediş Toplamı : " + hesap.hakedisToplami(asy, ysy));
        System.out.println("Tahakkuk Toplamı : " + hesap.tahakkukToplami(asy, ysy));
        System.out.println("Kesintiler Toplamı : " + hesap.kesintiToplami(asy, ysy));
        System.out.println("Net Ödenen : " + hesap.netOdenen(asy, ysy));
        
        
        
        
        
        
        
           
    }   
}
