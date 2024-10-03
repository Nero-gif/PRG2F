package hodina4;

import java.util.Scanner;

public class Ukol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cislo = sc.nextInt();
        if (cislo%5 == 0){
            System.out.println("Číslo je dělitelné 5");
        }
        else {
            System.out.println("Číslo není dělitelné 5");
        }

    }
}
