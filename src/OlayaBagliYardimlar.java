public class OlayaBagliYardimlar {
    private double evlenmeYardimi, dogumYardimi, hastalikYardimi, tabiAfetYardimi, olumYardimi, askerlikYardimi; 

    public double getEvlenmeYardimi() {
        return evlenmeYardimi;
    }

    public void setEvlenmeYardimi(boolean evlendimi) {
        if (evlendimi) {
            this.evlenmeYardimi = 140;
        } else {
            this.evlenmeYardimi = 0;
        }
        
    }

    public double getDogumYardimi() {
        return dogumYardimi;
    }

    public void setDogumYardimi(double dogumYardimi) {
        this.dogumYardimi = dogumYardimi;
    }

    public double getHastalikYardimi() {
        return hastalikYardimi;
    }

    public void setHastalikYardimi(double hastalikYardimi) {
        this.hastalikYardimi = hastalikYardimi;
    }

    public double getTabiAfetYardimi() {
        return tabiAfetYardimi;
    }

    public void setTabiAfetYardimi(double odenecekYardimTutari) {
        if (odenecekYardimTutari<=1000) {
            this.tabiAfetYardimi = odenecekYardimTutari;
        } else {
            this.tabiAfetYardimi =0;
        }
        
    }

    public double getOlumYardimi() {
        return olumYardimi;
    }

    public void setOlumYardimi(double olumYardimi) {
        this.olumYardimi = olumYardimi;
    }

    public double getAskerlikYardimi() {
        return askerlikYardimi;
    }

    public void setAskerlikYardimi(double askerlikYardimi) {
        this.askerlikYardimi = askerlikYardimi;
    }
    
}
