package hodina4;

import java.util.Scanner;

public class Ukol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cislo = sc.nextInt();

        if (cislo >= -100 && cislo <= 100 && cislo != 0) {
            System.out.println("Zadaná hodnota je v pořádku.");
        } else {
            System.out.println("Zadaná hodnota je neplatná.");
        }
    }

}
