package Hodiny;

import java.util.Scanner;

public class H_24_10_31_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte celé číslo.");
        int n = sc.nextInt();

        int out = 0;

        for (int i = 0; i <= n; i++){
            out += i;
        }

        System.out.println(out);
    }
}
