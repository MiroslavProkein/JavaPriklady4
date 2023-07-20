package Ulohy;
/*
ZADANIE:
Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad alebo rovne 90, tak vypíše známku A
        Ak je percento nad alebo rovne 75, tak vypíše známku B
        Ak je percento nad alebo rovne 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.

        HINT: pouzite prikaz if
*/
//TODO vytvorit "nekonecny" pouzivatelsky vstup na zadavanie a vyhodnotenie znamok. Ukonci, pokym nezadame zaporne cislo.... Pouzite while= cyklus s podmienkou na zaciatku

import java.util.Scanner;

public class PriradenieZnamky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // konzola

        //while (true) {
        for (;;){ //Nekonecny cyklus... aj toto je varianta
            System.out.print("Zadaj percento zo skusky a potvrd klavesom Enter (HINT: Pri zadani zaporneho cisla sa program ukonci): ");
            int percento = sc.nextInt();

            if (percento >= 90)
                System.out.println("Znamka je: A");
            else if (percento >= 75)
                System.out.println("Znamka je: B");
            else if (percento >= 65)
                System.out.println("Znamka je: C");
            else if (percento < 0)
                break; //Stopneme "nekonecny" cyklus, cize while (true)
            else
                System.out.println("Neuspel si.");
        }

        System.out.println("Koniec programu.");
    }

}
