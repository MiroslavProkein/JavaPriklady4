package Ulohy;

import java.util.Arrays;

/*Úloha na opakovanie:

Premenné, cykly a jednoduchý algoritmus na súčet
Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.

Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať výsledok po sčítaní.

Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu priemeruj(), ktorá vypočíta priemer z daných čísiel.

Bonusové úlohy naviac: Vytvorte metódu pocet(), ktorá zistí počet čísel v poli. Zároveň by tam mohla metóda, ktorá zisti najväčšie číslo v poli max(). Analogicky aj metódu min(), ktorá zisti najmenšie číslo v poli.*/
public class ZakladneExcelFunkcie {

    public static double max(double[] cisla) {
        Arrays.sort(cisla); //Zoradi cisla od najmensieho po najvacsie
        return cisla[cisla.length - 1];
    }

    public static double min(double[] cisla) {
        Arrays.sort(cisla); //Zoradi cisla od najmensieho po najvacsie
        return cisla[0]; //Odkazujeme sa na prvy prvok pola, cize ten je reprezentovany nulou 0
    }

    public static double sucet(double[] cisla) {
        double sum = 0; //vytvaram premennu sum, ktora reprezentuje sucet a na zaciatku obsahuje 0
        for (double cislo : cisla) {
            sum = sum + cislo; //Interpretujeme vpravo od =, cize najprv pojde k scitaniupremennych a vysledok sa ulozi do premennej nalavo od rovna sa
            //sum+= cislo; //Tento zapis robi presne to iste, co vyssie, cize sum= sum + cislo;
        }
        return sum;
    }

    public static int pocet(double[] cisla) {
        return cisla.length;
    }

    public static double priemer(double[] cisla) {
        return sucet(cisla) / pocet(cisla);
    }

    public static void vypisPoleCezForEach(double[] cisla) {
        for (double cislo : cisla) {
            System.out.println(cislo);
        }
    }

    public static void vypisPole(double[] cisla) {
        for (int i = 0; i < cisla.length; i++) {
            System.out.println(cisla[i]);

        }
    }

    public static void main(String[] args) {

        double cisla[] = {1, 2.5, 4, 8.5, 10}; //Vytvorili sme pole s desatinnymi cislami
        vypisPole(cisla);
        vypisPoleCezForEach(cisla);

        System.out.println("Vysledok scitania pola cisel (SUM) je: " + sucet(cisla));
        System.out.println("Vysledok priemerovania (AVERAGE) je: " + priemer(cisla));
        System.out.println("Vysledok poctu (COUNT) je: " + pocet(cisla));
        System.out.println("Vysledok maxima (MAX) je: " + max(cisla));
        System.out.println("Vysledok minima (MIN) je: " + min(cisla));

    }

}
