package Ukoly190924;

import java.util.Scanner;
public class TretiUkol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cislo1 = sc.nextInt();
        int cislo2 = sc.nextInt();
        int cislo3 = sc.nextInt();
        boolean IDK;
        if (cislo1+cislo2+cislo3 == 300) {
            IDK = true;
        }
        System.out.println(IDK);
    }
}
