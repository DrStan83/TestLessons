package devices;

public abstract class Notebook extends Computer{
    protected int cdSSD;
    protected double versionUsb;
    protected boolean wiFi;

    public abstract void batteryCharge();

    public Notebook() {
    }

    public int getCdSSD(){
        return cdSSD;
    }

    public void setCdSSD(int gb){
        this.cdSSD = gb;
    }

    public double getVersionUsb(){
        return versionUsb;
    }

    public void setVersionUsb(double verUsb){
        if(verUsb == 2.0 || verUsb == 3.0){
            this.versionUsb = verUsb;
        }else{
            System.out.println("Version USB not Supported");
        }
    }

    public boolean getwiFi(){
        return wiFi;
    }

    public void setWiFi(boolean wifi){
        if(wifi == true){
            System.out.println("Wi-Fi connected");
        }else {
            System.out.println("Wi-Fi disconnected");
        }
    }



}
