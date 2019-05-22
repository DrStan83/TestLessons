package devices;

public abstract class Notebook extends Computer{
    protected int cdSSD;
    protected boolean wiFi;

    public void batteryCharge() {
        print("Battery "+getName()+" Charge");
    }

    public void blueScreen() {
        print("Fatal error, please reboot system");
        reboot();
    }

    public int getCdSSD(){
        return cdSSD;
    }
    public void setCdSSD(int gb){
        this.cdSSD = gb;
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
