
public class AylikSosyalYardimlar {
    private double cocukYardimi, yemekYardimi, tasitYardimi, yakacakYardimi, direksiyonPrimi, hastalikVeRiskPrimi, silahTazminati,yolYardimi;

    public double getYolYardimi() {
        return yolYardimi;
    }

    public void setYolYardimi(double yolYardimi) {
        this.yolYardimi = yolYardimi;
    }


    
    
    
    public double getCocukYardimi() {
        return cocukYardimi;
    }

    public void setCocukYardimi(Kisi kisi) {
        if (kisi.getCocukSayisi()<=3) {
            this.cocukYardimi = kisi.getCocukSayisi()*25;
        } else if (kisi.getCocukSayisi()>3) {
            this.cocukYardimi = 3*25;
        } else {
            this.cocukYardimi= 0; 
        }
        
    }

    public double getYemekYardimi() {
        return yemekYardimi;
    }

    public void setYemekYardimi(Gun gun) {
        this.yemekYardimi = gun.getYemekVerilecekGun()*5;
    }

    public double getTasitYardimi() {
        return tasitYardimi;
    }

    public void setTasitYardimi(double tasitYardimi) {
        this.tasitYardimi = tasitYardimi;
    }

    public double getYakacakYardimi() {
        return yakacakYardimi;
    }

    public void setYakacakYardimi(double yakacakYardimi) {
        this.yakacakYardimi = yakacakYardimi;
    }


    public double getDireksiyonPrimi() {
        return direksiyonPrimi;
    }

    public void setDireksiyonPrimi(double direksiyonPrimi) {
        this.direksiyonPrimi = direksiyonPrimi;
    }

    public double getHastalikVeRiskPrimi() {
        return hastalikVeRiskPrimi;
    }

    public void setHastalikVeRiskPrimi(double hastalikVeRiskPrimi) {
        this.hastalikVeRiskPrimi = hastalikVeRiskPrimi;
    }

    public double getSilahTazminati() {
        return silahTazminati;
    }

    public void setSilahTazminati(double silahTazminati) {
        this.silahTazminati = silahTazminati;
    }
    
    
    
}
