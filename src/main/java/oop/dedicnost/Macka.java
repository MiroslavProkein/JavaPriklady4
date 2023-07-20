package oop.dedicnost;

public class Macka extends Cicavec {
    public boolean jeDomace = true;

    @Override
    public void sajeMlieko() {
        System.out.println("Macka saje mlieko");
        //super.sajeMlieko();
    }

    @Override
    public void steka() {
        System.out.println("Mnau, mnau!");
    }

    public void chytaMysi() {
        System.out.println("Macka chyta mysi");
    }

}
