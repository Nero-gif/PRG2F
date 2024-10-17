package Hodiny;
import java.util.Scanner;
public class H_24_10_17_01 {
        public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);

            int vstup;
            int suma = 0;

            do{
                System.out.println("Zadej číslo.");
                vstup = sc.nextInt();
                suma += vstup;
            } while (vstup != 0);

            System.out.println("Součet je "+suma);
        }
}
