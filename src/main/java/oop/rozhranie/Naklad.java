package oop.rozhranie;

public class Naklad implements INaklad, ISuperNaklad {
    @Override
    public void vypis() {
        // Konkretna implementacia danej metody
        System.out.println("Vypisujem konkretne udaje o naklade");
    }

    @Override
    public void vytlac() {

    }

    @Override
    public void zoznamNakladov() {

    }

    @Override
    public double celkoveNaklady() {
        return 0;
    }

    @Override
    public void exportDoPDF() {

    }

    @Override
    public void preplatiNamHoNiekto() {

    }
}
