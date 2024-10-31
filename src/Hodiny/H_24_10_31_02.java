package Hodiny;

import java.util.Scanner;

public class H_24_10_31_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte celé číslo.");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;
        }

        System.out.println("Factorial je "+factorial);
    }
}
