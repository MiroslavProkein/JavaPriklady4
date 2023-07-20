package oop.dedicnost;

public class DomaceZvierata {
    public static void main(String[] args) {
        Pes dunco = new Pes();
        dunco.sajeMlieko();
        dunco.jeDomace = true;
        dunco.steka();
        dunco.strazi();
        dunco.lietaDoVesmiru();
        System.out.println("Je domace zviera? " + dunco.jeDomace);

        Macka cica = new Macka();
        cica.sajeMlieko();
        cica.chytaMysi();
        cica.lietaDoVesmiru();
        System.out.println("Je domace zviera? " + cica.jeDomace);
    }
}

