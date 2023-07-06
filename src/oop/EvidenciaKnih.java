package oop;

public class EvidenciaKnih {
    public static void main(String[] args) {
        //TODO Ako vytvorit knihu a naplnit ju udajmi, cize vytvorime objekt Kniha
        Kniha kniha1 = new Kniha(); // Vytvorili sme objekt kniha, ktory neobsahuje ziadne udaje
        // Nasledne knihu vyplnime udajmi
        kniha1.autor = "Isaac Asimov";
        kniha1.nazov = "Ja, robot";
        kniha1.cena = 3.80;
        kniha1.pocetStran = 165;
        kniha1.rokVydania = 1960;

        //Vypisujem obsah knihy
        kniha1.pozdrav();
        System.out.println("Autor knihy: " + kniha1.autor);
        System.out.println("Nazov knihy: " + kniha1.nazov);
        System.out.println("Cena knihy: " + kniha1.cena + " €");
        System.out.println("Pocet stran knihy: " + kniha1.pocetStran);
        System.out.println("Rok vydania knihy: " + kniha1.rokVydania);

        //TODO vytvorit dalsiu knihu
        Kniha kniha2 = new Kniha(); // Vytvorili sme objekt kniha, ktory neobsahuje ziadne udaje
        kniha2.autor = "J.R.R. Tolkien";
        kniha2.nazov = "Hobit";
        /* kniha2.cena = 10.80;
        kniha2.pocetStran = 360;
        kniha2.rokVydania = 2015;*/
        //Vypisujem obsah knihy
        kniha2.pozdrav();
        System.out.println("Autor knihy: " + kniha2.autor);
        System.out.println("Nazov knihy: " + kniha2.nazov);
        if (kniha2.nazov == null) //Overim si, ci je nazov knihy naozaj prazdny
            System.out.println("Nazov knihy je naozaj prazdny !");

        System.out.println("Cena knihy: " + kniha2.cena + " €");
        System.out.println("Pocet stran knihy: " + kniha2.pocetStran);
        System.out.println("Rok vydania knihy: " + kniha2.rokVydania);

        //Vytvarame 3-tiu knihu
        Kniha kniha3 = null; //Ak priradime null, tak objekt Kniha v premennej kniha3 neexistuje
        try {
            kniha3.autor = "F.Hernert";
            kniha3.nazov = "Duna";
        } catch (NullPointerException e) { //Overujeme, ci je objekt prostrednictvom try-catch vytvoreny
            System.out.println("Objekt kniha3 je null, nie je vytvoreny");
        }


       /* //Overenie ci je kniha4 prazdna
        Kniha kniha4 = null;
        if (kniha4.isEmpty ()){ // isEmpty nefunguje pre prazdny alebo naplneny objekt kniha4, lebo neexistuje
            System.out.println("Objekt kniha4 neexistuje");
        }*/


    }
}
