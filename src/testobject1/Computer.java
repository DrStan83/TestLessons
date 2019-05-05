package testobject1;

public class Computer {

    private String name;
    private int ram;
    private int hdd;
    private double weight;

    private String mBoard;
    private String corpusMaterial;
    private boolean cdRom;
    private boolean integratedVieo;

    public Computer(int hdd, String name){
        this.hdd = hdd;
        this.name = name;
    }

    public Computer(String name){
        this.name = name;
  //      on();
    }

    public Computer (double weight){
        this.weight = weight;
    }

    public Computer(int hdd){
        this.hdd = hdd;
    }

    public Computer(boolean cdRom){
        this.cdRom = cdRom;
    }

    public Computer(String name, int ram, int hdd, double weight, String mBoard, String corpusMaterial, boolean cdRom, boolean integratedVieo) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.mBoard = mBoard;
        this.corpusMaterial = corpusMaterial;
        this.cdRom = cdRom;
        this.integratedVieo = integratedVieo;
      //  off();
    }

    public boolean getIntegratedVideo(){
        return integratedVieo;
    }

    public void setIntegratedVieo(Boolean missOrNot){
        if(integratedVieo == true) {
            this.integratedVieo = missOrNot;
            System.out.println("You may choose integratedVideo");
        }else {
            System.out.println("In System miss integratedVideo");
        }
    }

    public Boolean getCdRom(){
        return cdRom;
    }
    public void setCdRom(Boolean prezOrEps){
        if(prezOrEps == true) {
            this.cdRom = prezOrEps;
            System.out.println("CdRom is Ready!!!");
        }else {
            System.out.println("CdRom is missing");
        }
    }

    public String getmBoard(){
        return mBoard;
    }

    public void setmBoard(String stm){
        if(stm.equals("Star")){
            System.out.println("Такой производитель не поддерживается");
        }else{
            this.mBoard = stm;
        }
        System.out.println("Модель Материнской платы " + stm);
    }

    public String getCorpusMaterial(){
        return corpusMaterial;
    }

    public void setCorpusMaterial(String cM){
        if(cM.equals("Бумага") || cM.equals("Полиетилен")){
            System.out.println("Такое качество корпуса не приемлимо");
        }else {
            this.corpusMaterial = cM;
        }
        System.out.println("Corpus material " + cM);
    }




    public String getName(){
        return name;
    }
    public void setName(String newName){
       this.name = newName;
    }

    public int getRam(){
        return ram;
    }
    public void setRam(int newRam){
        if(newRam > 0) {
          this.ram = newRam;
        }else{
            System.out.println("Значение " + newRam + "Не может быть отрицательным");
        }
    }

    public int getHdd(){
        return hdd;
    }
    public void setHdd(int newHdd){
        if(newHdd > 0) {
            this.hdd = newHdd;
        }else{
            System.out.println("Значение " + newHdd + "Не может быть отрицательным");
        }

    }

    public void insertCd(){
       readCD("Чтение Диска");
    }

    private void readCD(String rcd){
        setCdRom(true);
        System.out.println(rcd);
    }

    public void blueScreen(){
        reboot("Я Перезагружаюсь");
    }

    private void reboot(String reb){
        off();
        System.out.println(reb);
        on();

    }


    private void print(String str){
        System.out.println(str);
    }


    public void on(){
        print(" I am On. My Model " + name);
    }

    public void off(){
       print("I am Off");
    }

    public void load(){
        print("I am Load. My HDD Space " + hdd + " Gb");
    }
}
