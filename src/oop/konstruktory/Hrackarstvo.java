package oop.konstruktory;

public class Hrackarstvo {
    public static void main(String[] args) {
        //Vytvorime prvu hracku
        Hracka moncici = new Hracka(); // Vytvorili sme novy objekt Hracka
        moncici.setNazov("Moncici");
        moncici.setCena(15.9);
        moncici.setFarba("Ruzove");
        //moncici.setMaterial("plys");
        //moncici.setVekoveUrcenie("0-99");

        System.out.println("Atributy hracky");
        System.out.println("Nazov: " + moncici.getNazov());
        System.out.println("Cena: " + moncici.getCena());
        System.out.println("Farba: " + moncici.getFarba());
        System.out.println("Material: " + moncici.getMaterial());
        System.out.println("Vekove urcenie: " + moncici.getVekoveUrcenie());

        System.out.println();
        
        // Vytvorime druhu hracku
        Hracka lego = new Hracka("plast", "rozna", 15.50, "0-99", "lego"); // Vytvorili sme objekt cez parametricky konstruktor
        // Vypiseme atributy druhej hracky
        System.out.println("Atributy hracky");
        System.out.println("Nazov: " + lego.getNazov());
        System.out.println("Cena: " + lego.getCena());
        System.out.println("Farba: " + lego.getFarba());
        System.out.println("Material: " + lego.getMaterial());
        System.out.println("Vekove urcenie: " + lego.getVekoveUrcenie());

        // Vytvorime tretiu hracku
        Hracka merkur = new Hracka("kov", "rozna","0-99", "Merkur"); // Vytvorili sme objekt cez parametricky konstruktor
        // Vypiseme atributy druhej hracky
        System.out.println(merkur);

        //Vytvorime stvrtu hracku
        Hracka bicykel = new Hracka();
        System.out.println(bicykel);

    }
}
