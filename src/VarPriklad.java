import java.util.Scanner;

public class VarPriklad {
    public static void main(String[] args) {
        var cislo = 10; //toto moze sposobit "necitatelnost" kodu
        System.out.println("Zadefinoval si toto cislo var: " +cislo);

        var nejakyText= "vyborny";
        var spolu = nejakyText + cislo;
        System.out.println("Spolu je: " + spolu);

        Scanner sc = new Scanner(System.in); //inicializacia scaner-a
        var vstupZKonzoly = sc.nextInt();

        //cislo= "desat";  //pretypovanie hodnotou nepojde
        //nejakyText = 1; //pretypovanie hodnotou nepojde

    }
}
