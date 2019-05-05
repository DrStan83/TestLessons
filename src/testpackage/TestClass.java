package testpackage;

import testobject1.Computer;
import busobject.Bus;
import testobject1.Notebook;

public class TestClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(350, "ASUS");
        notebook.on();
        notebook.load();
        notebook.off();

/*        Computer comp = new Computer("IBM", 2048, 350,2, "Asus", "Plastic", true, true);
        Computer comp1 = new Computer(350, "Intel");
        Computer comp2 = new Computer("IBM");

        comp = comp1;
        comp1 = comp2;
        comp2 = comp;


        comp1.on();
        comp2.on();


        Bus bus1 = new Bus();
        bus1.setOpenDoor(true);
        bus1.stop();
        bus1.loadPass();
        bus1.setOpenDoor(false);
        bus1.go();*/
    //    bus1.go();
 //       Computer comp = new Computer();
//        comp.setName("IBM");
//        comp.setHdd(350);
//        comp.setRam(2048);
//        comp.on();
//        comp.load();
//        comp.off();
//        comp.setmBoard("Asus");
//        comp.setCorpusMaterial("Пластик");
//        comp.setCdRom(true);
//        comp.setIntegratedVieo(false);
//        comp.insertCd();
//        comp.blueScreen();




    }
}
