package oop.evidenciazamestnancov;
import java.time.LocalDate;
import java.util.ArrayList;

public class Zamestnavatel {
    private String nazov;
    private ArrayList<Zamestnanec> zoznamZamestnancov = new ArrayList<>(); // Vytvoreny prazdny zoznam zamestnancov

   /* public Zamestnavatel() {
        zoznamZamestnancov
    }*/

    public void naplnZamestnancami() {
        Oddelenie marketingoveOddelenie = new Oddelenie(); // Vytvoril som prazdne marketingove oddelenie
        marketingoveOddelenie.setNazov("Marketingove oddelenie");
        marketingoveOddelenie.setPoschodie(2);

        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.setMeno("Miroslav");
        zamestnanec1.setPriezvisko("Prokein");
        zamestnanec1.setDatumNarodenia(LocalDate.of(2000, 6, 4));
        zamestnanec1.setJeVeduci(true);
        zamestnanec1.setOddelenie(marketingoveOddelenie); // Priradil som zamestnancovi konkretne oddelenie


        Oddelenie itOddelenie = new Oddelenie("IT oddelenie", 3);
        Zamestnanec zamestnanec2 = new Zamestnanec("Jozko", "Mrkva", LocalDate.of(1999, 12, 13), false, itOddelenie);
        Zamestnanec zamestnanec3 = new Zamestnanec("Igor", "Skaredy", LocalDate.of(2005, 1, 1), false, itOddelenie);

        // Do zoznamu zamestnancov pridam zamestnanca 1, 2 a 3
        zoznamZamestnancov.add(zamestnanec1);
        zoznamZamestnancov.add(zamestnanec2);
        zoznamZamestnancov.add(zamestnanec3);
    }

    public void vypisZamestnancov() {
        for (Zamestnanec konkretnyZamestnanec : zoznamZamestnancov) {
            System.out.println("Detaily o zamestnancovi: " + konkretnyZamestnanec);
        }
        System.out.println("\n\n");
    }

    public int pocetZamestnancov() {
        return zoznamZamestnancov.size();
    }

    public void pridajZamestnanca (Zamestnanec konkretnyZamestnanec){
        zoznamZamestnancov.add(konkretnyZamestnanec);
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    @Override
    public String toString() {
        return "{" +
                "nazov='" + nazov + '\'' +
                '}';
    }
}
