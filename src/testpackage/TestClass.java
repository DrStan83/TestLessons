package testpackage;

import asus.AsusZbook;
import toshiba.ToshibaSatelit;

public class TestClass {
    public static void main(String[] args) {

  //  AsusZbook zbook = new AsusZbook("Windows 10", "Asus Zbook", 2.8, "Aluminium",16384, 1024, 500, 3.0, true, "Asus x245", true, false, true, "Yellow");
        AsusZbook zbook = new AsusZbook();
        zbook.setOpSystem("Windows 10");
        zbook.setName("Zbook 17");
        zbook.setWeight(3.3);
        zbook.setHdd(1024);
        zbook.setRam(4096);
        zbook.setCdSSD(500);
        zbook.setCdRom(true);
        zbook.setmBoard("Asus X581GO");
        zbook.setWiFi(true);
        zbook.setColorLightKeyboard("Red");
        zbook.setCorpusMaterial("Aluminium");
        zbook.setVersionUsb(3.0);
        zbook.setFingerScanner(true);
        zbook.setIntegratedVieo(false);


        zbook.on();
        zbook.load();
        zbook.connectWiFi(true);
        zbook.off();
        zbook.readCD();
 //       zbook.reboot();
        zbook.ScanFinger(false);
        zbook.batteryCharge();
 //       zbook.blueScreen();
        zbook.changeColorKey("Yellow");
        zbook.aboutModel();


    }
}
