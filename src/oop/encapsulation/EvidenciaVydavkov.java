package oop.encapsulation;

public class EvidenciaVydavkov {
    public static void main(String[] args) {
        Vydavok chlieb = new Vydavok();
        chlieb.setNazov("Cierny chlieb");
        chlieb.setCena(1.90);
        chlieb.setKategoria("Potraviny");

        System.out.println("Nazov je: " + chlieb.getNazov());
        System.out.println("Cena je: " + chlieb.getCena());
        System.out.println("Kategoria je: " + chlieb.getKategoria());




    }
}
