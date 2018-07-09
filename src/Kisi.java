public class Kisi {


    private String TCNO , adSoyad, medeniDurum,IBAN,unvani;
    private boolean bes,sendika; 
    private int cocukSayisi;

    public String getTCNO() {
        return TCNO;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getMedeniDurum() {
        return medeniDurum;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getUnvani() {
        return unvani;
    }

    public boolean isBes() {
        return bes;
    }

    public boolean isSendika() {
        return sendika;
    }

    public int getCocukSayisi() {
        return cocukSayisi;
    }

    public Kisi(String TCNO, String adSoyad, String medeniDurum, String IBAN, String unvani, boolean bes, boolean sendika, int cocukSayisi) {
        this.TCNO = TCNO;
        this.adSoyad = adSoyad;
        this.medeniDurum = medeniDurum;
        this.IBAN = IBAN;
        this.unvani = unvani;
        this.bes = bes;
        this.sendika = sendika;
        this.cocukSayisi = cocukSayisi;
    }

}
