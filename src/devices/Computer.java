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
        this.integratedVideo = missOrNot;
    }

    public Boolean getCdRom() {
        return cdRom;
    }

    public void setCdRom(Boolean prezOrEps) {
            this.cdRom = prezOrEps;

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
    }

    public void readCD() {
        if (cdRom == true) {
            print("CD Disc Read");
        } else {
            print("CD Rom is not Find in this Model");
        }
    }






}
