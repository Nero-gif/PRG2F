package Úkoly;

import java.util.Scanner;

public class U_24_11_25_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte jméno.");
        String jmeno = sc.next();
        System.out.println("Zadejte přijímení");
        String prijimeni = sc.next();

        String out;

        out = String.valueOf(jmeno.charAt(2));

        for (int i = jmeno.length(); i > 0; i--) {
            out = out + jmeno.valueOf(i);
        }

        System.out.println(out);
        System.out.println(jmeno+prijimeni);



    }
}
