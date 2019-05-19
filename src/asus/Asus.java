package asus;

import devices.Notebook;

abstract class Asus extends Notebook {
    protected boolean fingerScanner;
    protected String colorLightKeyboard;

    public abstract void activateFingerScan();
    public abstract void changeColorKey();
    protected abstract void ScanFinger(boolean fingerScanner);

    public Asus() {
    }

    public Asus(boolean fingerScanner, String colorLightKeyboard) {
        this.fingerScanner = fingerScanner;
        this.colorLightKeyboard = colorLightKeyboard;
    }

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

