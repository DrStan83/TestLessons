package asus;

import asus.Asus;

public class AsusZbook extends Asus {

  @Override
    public void off() {
        print("I am Off" + name + "I have Wi-Fi " + wiFi + " I have Integrated Video " + integratedVideo);
    }


    public void ScanFinger(boolean fingerScanner) {
        if (fingerScanner == true) {
            System.out.println("Welcome");
        } else {
            System.out.println("Access ERROR");
        }
    }

}
