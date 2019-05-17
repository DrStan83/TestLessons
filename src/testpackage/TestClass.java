package testpackage;

import asus.AsusZbook;
import toshiba.ToshibaSatelit;

public class TestClass {
    public static void main(String[] args) {

    AsusZbook zbook = new AsusZbook("Windows 10", "Asus Zbook", 2.8, "Aluminium",16384, 1024, 500, 3.0, true, "Asus x245", true, false, true, "Yellow");
        zbook.on();
        zbook.load();
        zbook.activateFingerScan();
        zbook.batteryCharge();
        zbook.readCD();
        zbook.changeColorKey();
        zbook.blueScreen();
        zbook.off();
        zbook.ScanFinger(true);

        ToshibaSatelit satelit = new ToshibaSatelit("Windows 7", "Toshiba Satelit", 2.2, "Plastic", 8192, 500, 250, 2.0, true, "AsRock", true, true, 8,2.0);
        satelit.on();
        satelit.load();
        satelit.playSound();
        satelit.batteryCharge();
        satelit.BlueToothOn();
        satelit.readCD();
        satelit.blueScreen();
        satelit.off();



    }
}
