package Ulohy;

/*
Popis programu.Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď v “konzole”. Odpoveď bude alikvótna číselná známka, ktorú program vypíše.
Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program zadaním slova: koniec
Program po zadaní koniec ukončí svoju činnosť a nevypíše nič.
*/

public class CiselnePriradenieTextovejZnamke {
    public static void main(String[] args) {

        String vstupnatextovaZnamka = "vyborny";

        switch (vstupnatextovaZnamka) {
            case ("vyborny"):
                System.out.println(1);
                break;
            case ("chvalitebny"):
                System.out.println(2);
                break;
            case ("dobry"):
                System.out.println(3);
                break;
            case ("dostatocny"):
                System.out.println(4);
                break;
            case ("nedostatocny"):
                System.out.println(5);
                break;
            default:
                System.out.println("Neznamy vstup");
        }

    }
}
