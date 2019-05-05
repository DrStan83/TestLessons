package testobject1;

public class Toshiba extends Notebook {
    public Toshiba(int hdd, String name) {
        super(hdd, name);
    }

    public Toshiba(boolean cdRom) {
        super(cdRom);
    }

    protected void writeCd(boolean cdRom) {
        System.out.println("Start CD Write");
    }
}