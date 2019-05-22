package devices;

abstract class Computer extends DeviceWhithOS {

    protected String mBoard;
    protected boolean cdRom;
    protected boolean integratedVideo;
    protected double versionUsb;


    public double getVersionUsb(){
        return versionUsb;
    }

    public void setVersionUsb(double verUsb){
        if(verUsb == 2.0 || verUsb == 3.0){
            this.versionUsb = verUsb;
        }else{
            System.out.println("Version USB not Supported");
        }
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

    public void readCD() {
        if (cdRom == true) {
            print("CD Disc Read");
        } else {
            print("CD Rom is not Find in this Model");
        }
    }






}
