package hodina4;
import java.util.Scanner;
import java.util.Random;
public class Ukol2 {
    public static void main(String[] args) {
        Random rng = new Random();
        int cislo1 = rng.nextInt(1, 6);
        int cislo2 = rng.nextInt(1, 6);

        System.out.println("Číslo 1 je "+cislo1);
        System.out.println("Číslo 2 je "+cislo2);

        if (cislo1+cislo2 >= 10){
            System.out.println("Vyhráváte!!");
        } else if (cislo1 == cislo2) {
            System.out.println("Vyhráváte!!");
        }
        else {
            System.out.println("Prohráváte!!");
        }
    }
}
