package toshiba;

public class ToshibaSatelit extends Toshiba  {
    public ToshibaSatelit(String opSystem, String name, double weight, String corpusMaterial, int ram, int hdd, int cdSSD, double versionUsb, boolean wiFi, String mBoard, boolean cdRom, boolean integratedVideo, int speakerPower_Om, double blueToothVer) {
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
        super.speakerPower_Om = speakerPower_Om;
        super.blueToothVer = blueToothVer;

    }

    public void load() {
        print("I am Load. My Operation System " + opSystem);
    }

    public void on() {
        print(" I am On. My Model " + name + "My HDD Space " + hdd + "Gb" + " My ram " + ram + "Mb");
    }

    public void off() {
        print("I am Off " + name + " I have Wi-Fi " + wiFi + " I have Integrated Video " + integratedVideo + " and bluetooth Version " + blueToothVer);
    }


    public void readCD() {
        if (cdRom == true) {
            print("CD Disc Read");
        } else {
            print("CD Rom is not Find in this Model");
        }
    }
    public void blueScreen() {
        print("Fatal error, please reboot system" + name);
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

    public void playSound(){
        print("Now play track and speaker power = " + speakerPower_Om + "Om");
    }
    public void BlueToothOn(){
        print("Bluetooth " + blueToothVer + " on and you may connect device");
    }



    }

