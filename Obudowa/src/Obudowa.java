import java.util.Scanner;

public class Obudowa {

    public static void main(String[] args){
    float haight, depth, widrath, weight;
    int id;
    String wybor;
    Scanner in = new Scanner(System.in);
    System.out.print("Ile chcesz stworzyc obudów: ");
    id = in.nextInt();
    Case[] buda = new Case[id];

    for(int i=0;i<id;i++){
     buda[i]= new Case();
    }

    for (int i=1; i<=id; i++) {
        System.out.printf("Podaj Wysokość obudowy NR"+i+" ");
        buda[i-1].haight=in.nextFloat();
        System.out.printf("Podaj Głebokość obudowy NR"+i+" ");
        buda[i-1].depth=in.nextFloat();
        System.out.printf("Podaj Szerokość obudowy NR"+i+" ");
        buda[i-1].witragh=in.nextFloat();
        System.out.printf("Podaj Wage obudowy NR"+i+" ");
        buda[i-1].weight=in.nextFloat();
    }
        String ss="nie";
        System.out.printf("Czy chcesz wypisac Obudowe? wpisz \"tak\" lub \"nie\" ");
        wybor=in.next();

        if (wybor.equals("nie")){
            return;
        }

        if (wybor.equals("tak")){
            System.out.print("Ktora obudowe chcesz wyswietlic, Podaj jej nr: ");
            id=in.nextInt();
        }
		
        buda[id-1].dismision();




    }
}
