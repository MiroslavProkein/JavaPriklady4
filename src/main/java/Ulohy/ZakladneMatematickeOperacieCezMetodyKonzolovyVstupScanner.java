package Ulohy;

import java.util.Scanner;

public class ZakladneMatematickeOperacieCezMetodyKonzolovyVstupScanner {

    //Metody ulozim nad metodu main
    public static double scitaj (double cislo1, double cislo2){
        // Predtym ako vratim vysledok  scitania, tak mozem urobit s tymi hodnotami nieco "naviac"
        // To znamena, ze pouzijem nejaku aplikacnu logiku
        return cislo1 + cislo2;
    }

    public static double modulo (double cislo1, double cislo2){
        return  cislo1 % cislo2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Inicializacia Scanner ore vstup z "konyoly"
        System.out.print("Zadaj PRVE cislo (a potvrd klavesom Enter): ");
        double cislo1 = sc.nextDouble(); // Pre konkretny pouzivatelsky vstup (desatinne cislo) pouzijeme metodu nextDouble

        System.out.print("Zadaj DRUHE cislo (a potvrd klavesom Enter): ");
        double cislo2 = sc.nextDouble(); // Pre konkretny pouzivatelsky vstup (desatinne cislo) pouzijeme metodu nextDouble


        double sum = scitaj (cislo1,cislo2);
        System.out.printf("\nVysledkom scitania cisiel %.2f a %.2f je: %.2f", cislo1, cislo2, sum);
        //System.out.printf("\nVysledkom scitania cisiel %.2f a %.2f je: %.2f", cislo1, cislo2, scitaj(cislo1, cislo2));

        double modulo = modulo(cislo1,cislo2);
        System.out.printf("\nVysledkom modula (zvysku po deleni) cisiel %.2f a %.2f je: %.2f", cislo1, cislo2, modulo);







        }



    }


