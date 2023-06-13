package Ulohy;

/*Úloha 1: Základné matematické operácie

Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1 a cislo2.

        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.

        Bonusová úloha: Vedeli by ste v prípade desatinných miest nahradiť desatinnú bodku za čiarku?
        Pomôcka:
//Ako naformatovat cislo v SK formate na 2 desatinne miesta, pouzijeme %.2f
           System.out.printf("Desatinné číslo naformátované ako desatinná čiarka %.2f", desatinneCislo);

         Bonusová úloha č.2: Vytvorit konkretne matematicke operacie cez metody.
         Bonusová úloha č.3: Vstup hodnôt by mohol byť cez konzolu, čiže Scanner.*/


public class ZakladneMatematickeOperacie {
    public static void main(String[] args) {



                double cislo1 = 5;
                double cislo2 = 2;

                double scitanie = cislo1 + cislo2;
                double odcitanie = cislo1 - cislo2;
                double nasobenie = cislo1 * cislo2;
                double delenie = cislo1 / cislo2;
                double modulo = cislo1 % cislo2; // % reprezentuje zvysok po deleni, cize modulo



                System.out.println("Výsledkom sčítania hodnôt " + cislo1 + " a " + cislo2 + " je " + scitanie);
                System.out.println("Výsledkom odčítania hodnôt " + cislo1 + " a " + cislo2 + " je " + odcitanie);
                System.out.println("Výsledkom násobenia hodnôt " + cislo1 + " a " + cislo2 + " je " + nasobenie);
                System.out.println("Výsledkom delenia hodnôt " + cislo1 + " a " + cislo2 + " je " + delenie);
                System.out.println("Výsledkom modula hodnôt " + cislo1 + " a " + cislo2 + " je " + modulo);


                // Odcitanie so zaokruhlenim, resp. vypisanim do konzoly spolu so zaokruhlenim
                // Namiesto %.2f co reprezentuje cislo zaokruhlene na 2 desatinne cisla mozeme pouzit ine cislo, napr. %.1f
                // co zaokruhli cislo v konzole na 1 desatine miesto
                System.out.printf("\nVýsledkom sčítania hodnôt " + cislo1 + " a " + cislo2 + " je " + scitanie);
                System.out.printf("\nVýsledkom odčítania hodnôt %.2f a %.2f je %.2f ", cislo1, cislo2, odcitanie);
                System.out.printf("\nVýsledkom násobenia hodnôt " + cislo1 + " a " + cislo2 + " je " + nasobenie);
                System.out.printf("\nVýsledkom delenia hodnôt " + cislo1 + " a " + cislo2 + " je " + delenie);
                System.out.printf("\nVýsledkom modula hodnôt " + cislo1 + " a " + cislo2 + " je " + modulo);
            }
        }




