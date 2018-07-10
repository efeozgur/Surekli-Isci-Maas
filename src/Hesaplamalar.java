public class Hesaplamalar extends Kisi{
    
    public Hesaplamalar(String TCNO, String adSoyad, String medeniDurum, String IBAN, String unvani, boolean bes, boolean sendika, int cocukSayisi) {
        super(TCNO, adSoyad, medeniDurum, IBAN, unvani, bes, sendika, cocukSayisi);
    }
    
    private double brutUcret, gunlukUcret,SGKMatrahi,gvYolla; 

    public double getBrutUcret() {
        return brutUcret;
    }

    public void setBrutUcret(double brutUcretZamOrani) {
        this.brutUcret = (brutUcretZamOrani*Sabitler.asgariUcret/100)+Sabitler.asgariUcret;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(Gun gun) {
        this.gunlukUcret = getBrutUcret()/gun.getToplamGun();
    }
    
    public double hakedisToplami(AylikSosyalYardimlar ay, YillikSosyalYardimlar yil){
        return getBrutUcret()+ ay.getYemekYardimi()+ay.getCocukYardimi()+ay.getYolYardimi()+ay.getYakacakYardimi()+ yil.getBayramYardimi()+yil.getOgrenimYardimi();
    }
        
    public double SGK_Matrahi(AylikSosyalYardimlar ay ) {
        SGKMatrahi = getBrutUcret()+ay.getYemekYardimi()+ay.getYakacakYardimi()+ay.getYolYardimi()+ay.getDireksiyonPrimi()+ay.getHastalikVeRiskPrimi()+ay.getSilahTazminati()+ay.getTasitYardimi();
        return SGKMatrahi;
    }
    
    public  double sgk20 () {
        return SGKMatrahi*Sabitler.sgk20oran/100;
    }
    
    public  double sgk14 () {
        return SGKMatrahi*Sabitler.sgk14oran/100;
    }    
    
    public double sgk2 () {
        return SGKMatrahi *Sabitler.sgk2oran/100;
    }
    
    public  double sgk1 () {
        return SGKMatrahi*Sabitler.sgk1oran/100;
    }    
    
    public double gvMatrahi () {
        return (getBrutUcret()-(sgk14()+sgk1()));
    }
    
    public double gelirVergisi (int oran, int agi) {
        if (AGI.agiYolla(agi)<(gvMatrahi()*oran/100)) {
            gvYolla = (gvMatrahi()*oran/100)-AGI.agiYolla(agi);
            return gvYolla;
        } else {
            gvYolla = (gvMatrahi()*oran/100);
            return gvYolla;
        }       
    }
    
    public double damgaVergisi (AylikSosyalYardimlar ay, YillikSosyalYardimlar yil) {
        return hakedisToplami(ay, yil)*Sabitler.damgaVergisiOrani;
    }
    
    public double kesintiToplami(AylikSosyalYardimlar ay, YillikSosyalYardimlar yil) {
        return gvYolla+damgaVergisi(ay, yil)+sgk20()+sgk2()+sgk1()+sgk14();
    }
    
    public double tahakkukToplami(AylikSosyalYardimlar ay, YillikSosyalYardimlar yil){
        return hakedisToplami(ay, yil)+sgk20()+sgk2();
    }
    
    public double netOdenen(AylikSosyalYardimlar ay, YillikSosyalYardimlar yil) {
        return tahakkukToplami(ay, yil) - kesintiToplami(ay, yil) ;
    }
}
