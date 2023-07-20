package oop.kniznica;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KnihaService {
    ArrayList<Kniha> zoznamKnih; //My sme vytvorili objekt, resp. Arraylist ako prazdne

    //Bezparametricky konstruktor
    public KnihaService() {
        //zoznamKnih = naplnKniznicuKnihami();
        zoznamKnih = new ArrayList<>(); // Vytvorenie prazdneho zoznamu knih
    }

    public void zobrazMenu() {
        System.out.println("""
                                
                Vyber prosim jednu z moznosti:
                ------------------------------
                (1) Zadaj novu knihu
                (2) Zobraz vsetky knihy
                (3) Zobraz konkretnu knihu (podla indexu)
                (4) Vymaz konkretnu knihu (podla indexu)
                (5) Zobraz pocet vsetkych knih
                (6) Vyhladaj knihu podla nazvu
                (7) Nacitaj zoznam knih zo suboru (zadaj nazov suboru)
                (8) Uloz zoznam knih do suboru (zadaj nazov suboru)
                (9) Vymaz vsetky knihy
                Koniec = skonči zadavanie novej knihy             
                """);
    }

    public void hladajKnihyPodlaNazvu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj nazov knihy: ");
        String hladanyNazov = scn.nextLine();

        ArrayList<Kniha> najdeneKnihy = new ArrayList<Kniha>(); // Prazdny zoznam najdenych knih
        for (Kniha konkretnaKniha : zoznamKnih) { // foreach pre prechadzanie kazdej knihy v nasom zozname knih
            // Obsahuje nazov konktretnej knihy aspon cast nazvu knihy, ktory hladame?
            if (konkretnaKniha.getNazov().contains(hladanyNazov)) {
                najdeneKnihy.add(konkretnaKniha); // Ak taku knihu najde tak ju ulozi do zoznamu najdeneKnihy
            }
        }
        // Vypiseme najdene knihy
        System.out.println("\nNajdene knihy su tieto: ");
        for (Kniha najdenaKniha : najdeneKnihy) {
            System.out.println(najdenaKniha);
        }
    }

    // Metoda ulozDoSuboru vyzve pouzivatela na zadanie nazvu suboru a nasledneho ho ulozi
    public void ulozDoSuboru() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj nazov suboru");
        String nazovSuboru = scn.nextLine();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("kniznica.databaza"); // vytvorime subor s nazvom kniha.ser
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // vytvorime Object stream pre ukladanie objektov
            objectOutputStream.writeObject(zoznamKnih); // zapiseme objekt
            objectOutputStream.flush(); // realne uskutocnime operaciu zapisu
            objectOutputStream.close(); // zatvorime object output stream
            fileOutputStream.close(); // zatvorime file output stream, cize subor
            System.out.println("Subor je nacitany!");
        } catch (IOException e) {
            System.out.println("Nepodarilo sa vytvorit subor, resp. ho ulozit!");
            e.printStackTrace();
        }
    }

    // Metoda nacitajZoSuboru vyzve pouzivatela na zadanie nazvu suboru a nasledneho ho ulozi
    public void nacitajZoSuboru() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj nazov suboru");
        String nazovSuboru = scn.nextLine();
        try {
            FileInputStream fileInputStream = new FileInputStream(nazovSuboru);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            zoznamKnih = (ArrayList) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Subor je nacitany!");
        } catch (IOException e) {
            System.out.println("Nepodarilo sa otvorit subor!");
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Subor sa podarilo nacitat, ale nie je kompatibilny s ArrayLists!");
            //e.printStackTrace();
        }
    }

    public void pridajKnihu() {
        //Pouzivatelsky vstup na zadanie udajov knihy
        Scanner scn = new Scanner(System.in); // Inicializacia konzoly
        System.out.println("Zadaj nazov knihy: ");
        String nazovKnihy = scn.nextLine(); // Zadanie konkretneho textoveho udaju z konzoly (zadava pouzivatel)

        System.out.println("Zadaj autora danej knihy: ");
        String autor = scn.nextLine();

        System.out.println("Zadaj rok vydania: ");
        int rokVydania = scn.nextInt(); // Caka na pouzivatelsky vstup, ktory bude cele cislo

        // Vytvorili sme knihu na zaklade pouzivatelskych dat
        Kniha zadanaKniha = new Kniha(nazovKnihy, autor, rokVydania);

        // A nasledne knihu pridame do ArrayListu
        zoznamKnih.add(zadanaKniha);
    }

    public void vypisVsetkyKnihy() {
  /*      for (Kniha konkretnaKniha : zoznamKnih) {
            System.out.println(konkretnaKniha);
        }*/
        if (!zoznamKnih.isEmpty()) {
            for (int i = 0; i < zoznamKnih.size(); i++) {
                System.out.print("Index knihy " + i); // Index knihy
                System.out.print("\t"); //pouzijem este tabulator
                System.out.println(zoznamKnih.get(i)); // Detail knihy, ktory riesi metoda toString v Kniha.java
            }
        } else {
            System.out.println("Zoznam knih je prazdny!");
        }
    }

    public void odstranKnihu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj index knihy, ktoru chces odstranit?");
        int indexKnihy = scn.nextInt();
        if (potvrdVolbu()) {
            zoznamKnih.remove(indexKnihy); // Odstrani knihu pouzitim metody remove a indexu
            System.out.println("Kniha je odstranena");
        }
    }

    public Kniha najdiKnihu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj index knihy, ktoru chces zobrazit");
        int indexKnihy = scn.nextInt();
        return zoznamKnih.get(indexKnihy);
    }

    public int pocetKnih() {
        return zoznamKnih.size(); // Vrati pocet vsetkych knih, resp. poloziek z ArrayListu
    }

    private boolean potvrdVolbu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Naozaj si prajes koniec? Potvrd (a) ako ano, iny vstup pokracuje dalej.");
        String odpoved = scn.nextLine();
        if (odpoved.equalsIgnoreCase("a")) return true;
        else return false;
    }

    public void startMenu() {
        String vybrataMenuPolozka = "";
        // Opakujeme volbu pouzivatela
        while (!vybrataMenuPolozka.equals("koniec")) { // Nekonecny cyklus
            // Zobrazujeme menu
            zobrazMenu();
            // Rozhodovanie, co sme si vybrali
            Scanner scn = new Scanner(System.in);
            vybrataMenuPolozka = scn.nextLine().toLowerCase(); // Ocakavame akukolvek textovu hodnotu (zoberie aj cislo, ale ako text) a zaroven prekonvertuje na male pismena
            // Logicky blok
            // Chceme len vypisovat co vybral
            switch (vybrataMenuPolozka.toLowerCase()) { //"Prekonvertovali" sme String cize text na male pismena
                case "1" -> {
                    System.out.println("Vybral si cislo 1");
                    pridajKnihu();
                }
                case "2" -> {
                    System.out.println("Vybral si cislo 2");
                    vypisVsetkyKnihy();
                }
                case "3" -> {
                    System.out.println("Vybral si cislo 3");
                    Kniha najdenaKniha = najdiKnihu();
                    System.out.println("Detaily o najdenej knihe: " + najdenaKniha);
                }
                case "4" -> {
                    System.out.println("Vybral si cislo 4");
                    odstranKnihu();
                    // Tu bude pouzivatelsky vstup na zadanie indexu knihy, ktoru ideme zmazat
                    // Ked zadame index knihy, tak pred samotnym mazanim sa vykona metoda potvrdVolbu(scn), vid nizsie
                }
                case "5" -> {
                    System.out.println("Vybral si cislo 5");
                    System.out.println("Pocet vsetkych knih v zozname: " + pocetKnih());
                }
                case "6" -> {
                    hladajKnihyPodlaNazvu();
                }

                case "8" -> {
                    ulozDoSuboru();
                }
                case "7" -> {
                    nacitajZoSuboru();
                }

                case "koniec" -> {
                    System.out.println("Vybral si koniec");
                    if (potvrdVolbu()) System.exit(1);
                    else vybrataMenuPolozka = "";

                   /*if (odpoved.equalsIgnoreCase( "a" )) System.exit(0); // System.exit ukonci aplikaciu, respektive Java virtual machine
                    else vybrataMenuPolozka = "";*/
                    //if (odpoved.equalsIgnoreCase("a")) return;
                    //else vybrataMenuPolozka = "";
                }
                default -> {
                    System.out.println("Nevybral si nic z menu");
                    System.out.println("Zvolil si: " + vybrataMenuPolozka);
                }
            }
        }
    }

    public ArrayList<Kniha> naplnKniznicuKnihami() {

        // Vytvorime prvu ukazkovu knihu, objekt kniha1
        Kniha kniha1 = new Kniha("Ja, robot", "Isaac Asimov", 1919);
        Kniha kniha2 = new Kniha("1984", "George Orwell", 1915);
        Kniha kniha3 = new Kniha("To Kill a Mockingbird", "Harper Lee", 1912);
        Kniha kniha4 = new Kniha("Maly princ", "Antoine de Saint-Exupéry", 1910);
        Kniha kniha5 = new Kniha("Vládca prsteňov", "J.R.R. Tolkien", 1925);

        // Vytvorenie dynamickeho pola, teda ArrayListu v ktorom ulozime knihy
        ArrayList<Kniha> zoznamKnih = new ArrayList<>();
        zoznamKnih.add(kniha1); //Do zoznamKnih, cize ArrayListu sme doplnili prvu knihu
        zoznamKnih.add(kniha2); //Do zoznamKnih, cize ArrayListu sme doplnili druhu knihu
        zoznamKnih.add(kniha3); //Do zoznamKnih, cize ArrayListu sme doplnili tretiu knihu
        zoznamKnih.add(kniha4); //Do zoznamKnih, cize ArrayListu sme doplnili stvrtu knihu
        zoznamKnih.add(kniha5); //Do zoznamKnih, cize ArrayListu sme doplnili piatu knihu

        return zoznamKnih;
    }
}
