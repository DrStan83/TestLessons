package testobject1;

public class AsusZbook extends Asus {

    public AsusZbook(String opSystem, String name, double weight, String corpusMaterial, int ram, int hdd, int cdSSD, double versionUsb, boolean wiFi, String mBoard, boolean cdRom, boolean integratedVideo, boolean fingerScanner, String colorLightKeyboard) {
    super.opSystem = opSystem;
    super.name = name;
    super.weight = weight;
    super.corpusMaterial = corpusMaterial;
    super.ram = ram;
    super.hdd = hdd;
    super.cdSSD = cdSSD;
    super.versionUsb = versionUsb;
    super.wiFi = wiFi;
    super.mBoard = mBoard;
    super.cdRom = cdRom;
    super.integratedVideo = integratedVideo;
    super.fingerScanner = fingerScanner;
    super.colorLightKeyboard = colorLightKeyboard;
    }

    public void load() {
        print("I am Load. My Operation System " + opSystem);
    }

    public void on() {
        print(" I am On. My Model " + name);
    }

    public void off() {
        print("I am Off" + name);
    }


    public void readCD() {
        if (cdRom == true) {
            print("CD Disc Read");
        } else {
            print("CD Rom is not Find in this Model");
        }
    }
    public void blueScreen() {
        print("Fatal error, please reboot system");
        reboot();
    }

    public void reboot() {
        off();
        on();
        load();
    }

    public void batteryCharge() {
    print("Battery "+name+" Charge");
    }

    public void activateFingerScan() {
    print("Finger Scanner Activated, please add Finger and Password");
    }

    public void changeColorKey() {
    setColorLightKeyboard("Green");
    }


    public void ScanFinger(boolean fingerScanner) {
        if (fingerScanner == true) {
            System.out.println("Welcome");
        } else {
            System.out.println("Access ERROR");
        }
    }

}
