package oop;

public class EvidenciaVozidiel {
    public static void main(String[] args) {

        //Volvo
        Auto auto = new Auto();
        auto.znacka = "Volvo";
        auto.farba = "Cierna";
        auto.objemMotora = 1500;

        System.out.println(auto.vypisZnacku());
        System.out.println("Znacka auta je: " + auto.znacka);
        System.out.println("Farba auta je: " + auto.farba);
        System.out.println("Objem motora auta je: " + auto.objemMotora);

        System.out.println();

        //Audi
        Auto auto2 = new Auto();
        auto2.znacka = "Audi";
        auto2.farba = "Modra";
        auto2.objemMotora = 1700;

        System.out.println(auto2.vypisZnacku());
        System.out.println("Znacka auta je: " + auto2.znacka);
        System.out.println("Farba auta je: " + auto2.farba);
        System.out.println("Objem motora auta je: " + auto2.objemMotora);

        System.out.println();

        //Toyota
        Auto auto3 = new Auto();
        auto3.znacka = "Toyota";
        auto3.farba = "Cervena";
        auto3.objemMotora = 1000;

        System.out.println(auto3.vypisZnacku());
        System.out.println("Znacka auta je: " + auto3.znacka);
        System.out.println("Farba auta je: " + auto3.farba);
        System.out.println("Objem motora auta je: " + auto3.objemMotora);





    }
}
