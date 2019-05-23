package asus;

import asus.Asus;

public class AsusZbook extends Asus {

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

}
