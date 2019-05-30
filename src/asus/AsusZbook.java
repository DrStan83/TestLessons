package asus;

import asus.Asus;
import devices.Computer;
import devices.DeviceWhithOS;
import devices.Notebook;

public class AsusZbook extends DeviceWhithOS implements  Asus {
    private String mBoard;
    private boolean cdRom;
    private boolean integratedVideo;
    private double versionUsb;

    protected boolean fingerScanner;
    protected String colorLightKeyboard;

    private int cdSSD;
    private boolean wiFi;




    // 1  Notebook
    public void connectWiFi(boolean connectWifi){
        if(connectWifi== true){
            System.out.println("Wi-Fi connected");
        }else {
            System.out.println("Wi-Fi disconnected");
        }

    }

    public void batteryCharge() {
        print("Battery "+getName()+" Charge");
    }

    public void blueScreen() {
        print("Fatal error, please reboot system");
        reboot();
    }
// 1

    public void setFingerScanner(boolean fScan) {
        this.fingerScanner = fScan;
    }

    public boolean getFingerScanner() {
        return fingerScanner;
    }

    public String getColorLightKeyboard(){
        return colorLightKeyboard;
    }

    public void setColorLightKeyboard(String colorKey){
        this.colorLightKeyboard = colorKey;
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
        this.wiFi = wifi;
    }


    //
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


    public boolean getIntegratedVideo() {
        return integratedVideo;
    }

    public void setIntegratedVieo(Boolean missOrNot) {
        this.integratedVideo = missOrNot;
    }

    public Boolean getCdRom() {
        return cdRom;
    }

    public void setCdRom(Boolean prezOrEps) {
        this.cdRom = prezOrEps;

    }

    public String getmBoard() {
        return mBoard;
    }

    public void setmBoard(String stm) {
        if (stm.equals("Star")) {
            System.out.println("Такой производитель не поддерживается");
        } else {
            this.mBoard = stm;
        }
    }

    public void readCD() {
        if (cdRom == true) {
            print("CD Disc Read");
        } else {
            print("CD Rom is not Find in this Model");
        }
    }
    //

  @Override
    public void off() {
        print("I am Off" + getName() + "I have Wi-Fi " + getwiFi() + " I have Integrated Video " + getIntegratedVideo());
    }


    public void ScanFinger(boolean fingerScanner) {
        if (fingerScanner == true) {
            System.out.println("Welcome");
        } else {
            System.out.println("Access ERROR");
        }
    }

    public void changeColorKey(String colorLightKeyboard){
        print("Color keyboard change  on " + colorLightKeyboard);
    }


    public void aboutModel (){
        print("My Model " + getName() + "  HDD " + getHdd() + "  RAM " + getRam() + "  Corpus " + getCorpusMaterial());
        print("I Have Wi-Fi " + getwiFi() + "  CdRom " + getCdRom() + " " + getCdSSD() + " Gb " + "Finger Scanner  "+getFingerScanner() + "  USB " + getVersionUsb());
        print(" My keyboard " + getColorLightKeyboard() + " OS " + getOpSystem() + " MainBoard " +getmBoard());
    }

}
