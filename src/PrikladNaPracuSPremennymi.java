import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/*
Uloha c.1: Priklad na pracu s premennymi

        Vypíšte do konzoly nasledujúci text:

        Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor. V Bratislave dňa (aktualny datum...naformatovat)

        Poznámka: Meno studenta, Dátum narodenia, známku a rok + aktuálny dátum nastavte tak, aby sa dali meniť v zdrojovom kóde (t.j. cez premenné).
*/
public class PrikladNaPracuSPremennymi {
    public static void main(String[] args) {

        String menoStudenta= "Jozef Mrkvicka";
        String datumNarodenia=  "03.04.2000";
        double znamka = 1.5;
        int rok= 2022;

        // toto je na aktualny datum ( 18.06.2022)
        Date datum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Student " +menoStudenta+ " sa narodil "  + datumNarodenia+ ", z maturitnej skusky ma znamku "+ znamka+ " a od septembra "+rok+ " nastupi do nového zamestnania ako Java programátor.");
        //Takto dam aktualny slovenky datum- format.
        System.out.println("V Bratislave dňa " + formatDatumu.format(datum));

        // vypiste znamku vo formate, ktory je akceptovatelny pre slovaka, cize zobrazime desatinnu ciarku
        // %.2f pouzijem toto aby mi ukazalo desatinnu ciarku namiesto bodky.... na 2 desatinne miesta ak cchem napr na 10 des miest dam %.10f
        System.out.printf("Student  ma znamku %.2f", znamka);
    }
}
