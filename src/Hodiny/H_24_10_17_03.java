package Hodiny;

import java.util.Scanner;

public class H_24_10_17_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vstup;
        int sude = 0;

        do {
            System.out.println("Zadejte číslo");
            vstup = sc.nextInt();
            if (vstup % 2 == 0){
                sude ++;
            }
        }
        while (vstup > 0);
            System.out.println("Počet sudých čísel je "+sude);

    }
}
