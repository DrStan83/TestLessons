package testobject1;

public abstract class DeviceWhithOS {
    protected String opSystem;
    protected String name;
    protected double weight;
    protected String corpusMaterial;
    protected int ram;
    protected int hdd;

    protected DeviceWhithOS(String name, String opSystem, int ram, int hdd, double weight, String corpusMaterial) {
        this.name = name;
        this.opSystem = opSystem;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.corpusMaterial = corpusMaterial;
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
        System.out.println("Corpus material " + cM);
    }


    protected void print(String str) {
        System.out.println(str);
    }

    public abstract void load();
 //       print("I am Load. My name " + opSystem);


    public abstract void on();
 //       print(" I am On. My Model " + name);


    public abstract void off();
  //      print("I am Off" + name);

}