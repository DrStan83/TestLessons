package toshiba;

import devices.DeviceWhithOS;

public class ToshibaSatelit extends DeviceWhithOS implements  Toshiba {

    private int volume;

    private String mBoard;
    private boolean cdRom;
    private boolean integratedVideo;
    private double versionUsb;

    private int cdSSD;
    private boolean wiFi;


    private int speakerPower_Om;
    private double blueToothVer;


public int getVolume(){
    return volume;
}

public void setVolume(int volume){
    if (volume >= 10){
        System.out.println(" MAX  VOLUME  ");
    }else {
        this.volume = volume;
    }
}

    public void soundOff(int volume){
    volume = 0;
    }

    @Override
    public void off() {
        print("I am Off " + getName() + " I have Wi-Fi " + getwiFi() + " I have Integrated Video " + getIntegratedVideo() + " and bluetooth Version " + getBlueToothVer());
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


    public int getSpeakerPower_Om(){
        return getSpeakerPower_Om();
    }

    public void setSpeakerPower_Om(int power_om){
        this.speakerPower_Om = power_om;
    }


    public double getBlueToothVer(){
        return blueToothVer;
    }

    public void setBlueToothVer(double bToothVer){
        this.blueToothVer = bToothVer;
    }


    public void BlueToothOn() {
        print("Bluetooth " + blueToothVer + " on and you may connect device");
    }


    public void playSound() {
        print("Now play track and speaker power = " + speakerPower_Om + "Om");
    }

    public void readCD() {
        if (cdRom == true) {
            print("CD Disc Read");
        } else {
            print("CD Rom is not Find in this Model");
        }
    }

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

    public void aboutModel (){
        print("My Model " + getName() + "  HDD " + getHdd() + "  RAM " + getRam() + "  Corpus " + getCorpusMaterial());
        print("I Have Wi-Fi " + getwiFi() + "  CdRom " + getCdRom() + " " + getCdSSD() + " Gb " + "  USB " + getVersionUsb());
        print(" My volume " + getVolume() + " OS " + getOpSystem() + " MainBoard " +getmBoard());
    }






    }

