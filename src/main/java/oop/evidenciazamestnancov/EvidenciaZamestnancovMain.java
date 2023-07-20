package oop.evidenciazamestnancov;

import java.time.LocalDate;

public class EvidenciaZamestnancovMain {
    public static void main(String[] args) {
        // Prvy zamestnavatel
        Zamestnavatel ibm = new Zamestnavatel();
        ibm.setNazov("IBM");
        System.out.println("\nInformacie o zamestnavatelovi" + ibm);
        ibm.naplnZamestnancami();
        ibm.vypisZamestnancov();
        System.out.println("Pocet zamestnancov vo firme je: " + ibm.pocetZamestnancov());


        // Druhy zamestnavatel
        Zamestnavatel microsoft = new Zamestnavatel();
        microsoft.setNazov("Microsoft");
        //microsoft.naplnZamestnancami();
        Oddelenie pravneOddelenie = new Oddelenie("Pravne oddelenie", 1);
        Zamestnanec zamestnanec1 = new  Zamestnanec("Eva", "Hrozna", LocalDate.of(1980, 6, 30), false,pravneOddelenie);
        microsoft.pridajZamestnanca(zamestnanec1); // Pridam zamestnanca ku konkretnemu zamestnavatelovi

        System.out.println("\nInformacie o zamestnavatelovi" + microsoft);
        microsoft.vypisZamestnancov();
        System.out.println("Pocet zamestnancov vo firme je: " + microsoft.pocetZamestnancov());


    }
}
