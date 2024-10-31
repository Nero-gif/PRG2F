package Hodiny;

import java.util.Random;
import java.util.Scanner;

public class H_24_10_31_03 {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);

        int dead = 13;
        int hod;
        int Deaths = 0;

        System.out.println("Kolikrát chcete házet?");
        int PocetHodu = sc.nextInt();

        for (int i = 1; i <= PocetHodu; i++){
            hod = rng.nextInt(1, 21);
            if (hod == dead){
                Deaths ++;
            }
        }
        System.out.println("Přišel jsi o "+Deaths+" životů");

        double nevim = PocetHodu/100.0;
        double Procenta = Deaths/nevim;

        if (Deaths != 0) {
            System.out.println("Přišel jsi o " + Procenta + "% životů");
        }
    }
}
