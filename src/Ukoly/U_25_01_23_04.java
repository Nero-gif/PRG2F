package Ukoly;

import java.util.Scanner;

public class U_25_01_23_04 {

    public static int sumOfDigits(int n) {
        n = Math.abs(n);

        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte číslo: ");
        int number = scanner.nextInt();
        
        int result = sumOfDigits(number);

        System.out.println("Součet číslic čísla " + number + " je: " + result);
    }
}
