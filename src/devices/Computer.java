package devices;

abstract class Computer extends DeviceWhithOS {

    protected String mBoard;
    protected boolean cdRom;
    protected boolean integratedVideo;

    public Computer(){

    }


    public Computer(String name, int ram, int hdd, double weight, String mBoard, String corpusMaterial, boolean cdRom, boolean integratedVieo) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.mBoard = mBoard;
        this.corpusMaterial = corpusMaterial;
        this.cdRom = cdRom;
        this.integratedVideo = integratedVieo;

    }

    public boolean getIntegratedVideo() {
        return integratedVideo;
    }

    public void setIntegratedVieo(Boolean missOrNot) {
        if (integratedVideo == true) {
            this.integratedVideo = missOrNot;
            System.out.println("You may choose integratedVideo");
        } else {
            System.out.println("In System miss integratedVideo");
        }
    }

    public Boolean getCdRom() {
        return cdRom;
    }

    public void setCdRom(Boolean prezOrEps) {
        if (prezOrEps == true) {
            this.cdRom = prezOrEps;
            System.out.println("CdRom is Ready!!!");
        } else {
            System.out.println("CdRom is missing");
        }
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
        System.out.println("Модель Материнской платы " + stm);
    }

    public abstract void readCD();
    public abstract void blueScreen();
    public abstract void reboot();






}
