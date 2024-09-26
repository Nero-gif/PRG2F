import java.util.Random;
import java.util.Scanner;

public class RandomNVM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MIN = sc.nextInt();
        int MAX = sc.nextInt();

        if (MAX < MIN) {
            int NVM = MIN;
            MIN = MAX;
            MAX= NVM;
        Random rng = new Random();
        int vysledek = rng.nextInt(MIN, MAX);
        System.out.println(vysledek);
    }

}}
