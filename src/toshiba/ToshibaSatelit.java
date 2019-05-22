package toshiba;

public class ToshibaSatelit extends Toshiba  {
private int volume;

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








    }

