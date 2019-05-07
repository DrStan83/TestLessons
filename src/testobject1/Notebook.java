package testobject1;

public abstract class Notebook extends Computer{
    protected int cdSSD;
    protected double wersionUsb;
    protected boolean wiFi;

    public Notebook() {
    }

    public int getCdSSD(){
        return cdSSD;
    }

    public void setCdSSD(int gb){
        this.cdSSD = gb;
    }

    public double getWersionUsb(){
        return wersionUsb;
    }

    public void setWersionUsb(double werUsb){
        if(werUsb == 2.0 || werUsb == 3.0){
            this.wersionUsb = werUsb;
        }else{
            System.out.println("Wersion USB not Supported");
        }
    }

    public boolean getwiFi(){
        return getwiFi();
    }

    public void setWiFi(boolean wifi){
        if(wifi == true){
            System.out.println("Wi-Fi connected");
        }else {
            System.out.println("Wi-Fi disconnected");
        }
    }

        public abstract void batteryCharge();

}
