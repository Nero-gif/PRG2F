package Hodiny;

import java.util.Scanner;

public class H_24_11_28_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napište větu.");
        String veta = sc.nextLine();

        int pocet = 0;

        for (int i = 0; i < veta.length(); i++) {
            if (veta.charAt(i) == ' ' || veta.charAt(i) == '.') {
                pocet++;
            }
        }

        System.out.println("Vaše věta má "+pocet+" slov.");

    }
}
