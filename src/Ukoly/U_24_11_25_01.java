package Ukoly;

import java.util.Scanner;

public class U_24_11_25_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte jméno.");
        String jmeno = sc.next();
        System.out.println("Zadejte přijímení");
        String prijimeni = sc.next();

        String out = "";

        for (int i = jmeno.length() - 1; i >= 0; i--) {
            out = out + jmeno.charAt(i);
        }
        out = out + " ";

        for (int i = prijimeni.length() - 1; i >= 0; i--) {
            out = out + prijimeni.charAt(i);
        }

        System.out.println(out.toUpperCase());
    }
}
