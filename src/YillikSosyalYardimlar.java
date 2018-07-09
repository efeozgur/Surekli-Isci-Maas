public class YillikSosyalYardimlar {
    private double ogrenimYardimi, bayramYardimi;   
    
    public double getOgrenimYardimi() {
        return ogrenimYardimi;
    }

    public void setOgrenimYardimi(int okul) {
        if (okul == 1) {
            this.ogrenimYardimi = 100;    
        } else if(okul==2) {
            this.ogrenimYardimi = 110; 
        } else if(okul==3) {
            this.ogrenimYardimi= 120;
        } else if(okul==4) {
            this.ogrenimYardimi = 140;
        } else  {
            this.ogrenimYardimi=0; 
        }        
    }

    public double getBayramYardimi() {
        return bayramYardimi;
    }

    public void setBayramYardimi(int bayram) {
        this.bayramYardimi = bayramYardimi;
    }
}
