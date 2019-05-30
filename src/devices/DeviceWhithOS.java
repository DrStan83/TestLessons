package devices;

import asus.AsusZbook;

public abstract class DeviceWhithOS {
    protected String opSystem;
    protected String name;
    protected double weight;
    protected String corpusMaterial;
    protected int ram;
    protected int hdd;
  //  public static int ramSlot = 2;
    public static int mFunCooller = 1200;
    public static int allRam;




    public static void addRam(int newRam){
        allRam = newRam;
        print("Added ram = " + allRam);
    }

    public void ramUpdate(){
        allRam = allRam + getRam();
        System.out.println("All Ram select " + allRam);    }



//    public static void addRam(int ram2){
//        if(ram2 > 8192){
//           print("Max memory size in slot 8 GB ");
//        }else{
//            allRam = ram2;
//
//        }
//    }


    public static void changeFunCooller(int funCooller){
        if(funCooller > 6200 || funCooller < 200){
            print("Max speed 6200 O.min and Min speed 200 ");
        }else {
            mFunCooller = funCooller;
            print("Cooller Fun " + mFunCooller);
        }
    }




    protected DeviceWhithOS() {
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getOpSystem(){
        return opSystem;
    }

    public void setOpSystem(String newOs){
        this.opSystem = newOs;
    }


    public int getRam() {
        return ram;
    }

    public void setRam(int newRam) {
        if (newRam > 0) {
            this.ram = newRam;
        } else {
            System.out.println("Значение " + newRam + "Не может быть отрицательным");
        }
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int newHdd) {
        if (newHdd > 0) {
            this.hdd = newHdd;
        } else {
            System.out.println("Значение " + newHdd + "Не может быть отрицательным");
        }
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double waga){
        this.weight = waga;
    }

    public String getCorpusMaterial(){
        return corpusMaterial;
    }

    public void setCorpusMaterial(String cM) {
        if (cM.equals("Бумага") || cM.equals("Полиетилен")) {
            System.out.println("Такое качество корпуса не приемлимо");
        } else {
            this.corpusMaterial = cM;
        }
    }


    public static void print(String str) {
        System.out.println(str);
    }

    public void load() {
              print("I am Load. My OS " + opSystem);
    }

    public  void on(){
            print(" I am On. My Model " + name + "My HDD Space " + hdd + "Gb" + " My ram " + ram + "Mb");
        }


    public void reboot() {
        off();
        on();
        load();
    }

    public void off(){
        print("I'm off.  My Corpus Material " + corpusMaterial);
    }
}