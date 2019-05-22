package toshiba;

import devices.Notebook;

public abstract class Toshiba extends Notebook {
    protected int speakerPower_Om;
    protected double blueToothVer;

    public void BlueToothOn(){
        print("Bluetooth " + blueToothVer + " on and you may connect device");
    }


    public void playSound(){
        print("Now play track and speaker power = " + speakerPower_Om + "Om");
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


}