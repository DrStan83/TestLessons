package toshiba;

import devices.Notebook;

public abstract class Toshiba extends Notebook {
    protected int speakerPower_Om;
    protected double blueToothVer;

   public abstract void playSound();
   public abstract void BlueToothOn();

    public Toshiba(){

    }

    public Toshiba(int speakerPower_Om, double blueToothVer){
        this.speakerPower_Om = speakerPower_Om;
        this.blueToothVer = blueToothVer;

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