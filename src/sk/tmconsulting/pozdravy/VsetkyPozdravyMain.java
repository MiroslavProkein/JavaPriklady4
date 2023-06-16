package sk.tmconsulting.pozdravy;

import sk.tmconsulting.pozdravy.anglicky.HelloInEnglish;
import sk.tmconsulting.pozdravy.madarsky.Szia;
import sk.tmconsulting.pozdravy.nemecky.Hallo;
import sk.tmconsulting.pozdravy.slovensky.Ahoj;

public class VsetkyPozdravyMain {
    public static void main(String[] args) {
        HelloInEnglish.pozdravujem();
        Ahoj.pozdravujem();
        Szia.pozdravujem();
        Hallo.pozdravujem();


    }
}
