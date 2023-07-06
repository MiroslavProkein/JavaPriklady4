package oop;

import javax.sound.midi.Soundbank;

public class SkladOvocia {
    public static void main(String[] args) {
        Ovocie jablko = new Ovocie();
        jablko.farba = "zelena";
        jablko.jeSladke = true;
        jablko.mnozstvoVitaminov = 90;
        jablko.odroda = "Red delicious";
        jablko.nazov = "Jablko";
        
        
        Ovocie hruska = new Ovocie();
        hruska.farba = "zelena";
        hruska.jeSladke = true;
        hruska.mnozstvoVitaminov = 80;
        hruska.odroda = "domaca";
        hruska.nazov = "Hruska";

        System.out.println("Nazov ovocia: " + jablko.akeOvocie());
        System.out.println("Farba jablka: " + jablko.farba);
        System.out.println("Je sladke: " +jablko.jeSladke);
        System.out.println("Mnozstvo vitaminov: " + jablko.mnozstvoVitaminov);
        System.out.println("Odroda: " + jablko.odroda);

        System.out.println(); //prazdny riadok

        System.out.println("Nazov ovocia: " + hruska.akeOvocie());
        System.out.println("Farba hrusky: " + hruska.farba);
        System.out.println("Je sladke: " +hruska.jeSladke);
        System.out.println("Mnozstvo vitaminov: " + hruska.mnozstvoVitaminov);
        System.out.println("Odroda: " + hruska.odroda);


    }
}
