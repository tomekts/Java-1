import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Zadanie1 {

    public static void main (String[] args)throws FileNotFoundException {
        String zdanie;
        String wybor;
        File plik = new File("zad.txt");
        Scanner odczyt = new Scanner(System.in);
        Scanner plikOdczyt = new Scanner(plik);
        System.out.printf("Wpisz co chcesz zapisac do pliku ");
        zdanie = odczyt.nextLine();

        PrintWriter zapis = new PrintWriter("zad.txt");
        zapis.println(zdanie);
        zapis.close();
        System.out.printf("czy chcesz wyświetlic plik, wpisz tak, lub nie ");
        wybor=odczyt.nextLine();
        if (wybor.equals("tak")){
            System.out.println(plikOdczyt.nextLine());
        }
        else if (wybor.equals("nie")){
            System.out.println("wybranoe nie wiec nie wypisuje");
        }
        else{
            System.out.println("błedny wybor, koniec programu");
        }








    }
}
