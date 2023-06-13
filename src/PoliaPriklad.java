public class PoliaPriklad {
    public static void main(String[] args) {
        String[] bicycles ; // Prazdne pole
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]); //vypise Volvo... cislo 0
        System.out.println(cars[3]); //vypise Mazdu... cislo 3 atd

       //System.out.println(cars); //Toto nam nevypise vysledok, cize nevypise obsah pola


        System.out.println("\nPrvy sposob ako vypisat obsah polia");
        //Prvy sposob, prostrednictvom cyklus s pevnym poctom opakovanim
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("\nDruhy sposob ako vypisat obsah polia");
        //Druhy sposob, prostrednictvom foreach
        for (String car :cars) {
            System.out.println(car);
        }


    }

}
