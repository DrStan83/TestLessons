package asus;

import devices.Notebook;

abstract class Asus extends Notebook {
    protected boolean fingerScanner;
    protected String colorLightKeyboard;

    public void changeColorKey(String colorLightKeyboard){
        print("Color keyboard change  on " + colorLightKeyboard);
    }
    protected abstract void ScanFinger(boolean fingerScanner);





    public void setFingerScanner(boolean fScan) {
        this.fingerScanner = fScan;
    }

    public boolean getFingerScanner() {
        return fingerScanner;
    }

    public String getColorLightKeyboard(){
        return colorLightKeyboard;
    }

    public void setColorLightKeyboard(String colorKey){
        this.colorLightKeyboard = colorKey;
    }

}

