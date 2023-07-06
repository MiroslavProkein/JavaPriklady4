package oop;

public class Kniha {
    public String nazov;
    public  String autor;
    public int rokVydania;
    public int pocetStran;
    public double cena;

    public void  pozdrav () {
        System.out.println("Ahoj, ja som vytvoreny objekt kniha, cize naozajstna kniha! " + nazov);
    }

}
