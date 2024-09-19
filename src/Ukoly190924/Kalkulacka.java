package Ukoly190924;

import java.util.Scanner;
public class Kalkulacka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš číslo");
        int cislo1 = sc.nextInt();
        System.out.println("Napiš další číslo");
        int cislo2 = sc.nextInt();
        System.out.println(cislo1+cislo2);
        System.out.println(cislo1-cislo2);
        System.out.println(cislo1*cislo2);
        System.out.println(cislo1/cislo2);
    }
}
