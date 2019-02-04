import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ala.txt");
        Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        System.out.println(zdanie);
        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println("ssij parówo");
        zapis.close();
    }
}
