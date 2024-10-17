package Hodiny;

import java.util.Scanner;

public class H_24_10_17_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i < 4) {
            i ++;
            System.out.println("Zadejte heslo.");
            int userpassword = sc.nextInt();

            int mypassword = 666;

            if (userpassword == mypassword) {
                System.out.println("Heslo je správně.");
                return;
            } else{
                System.out.println("Heslo není správně");
            }
        }

    }
}
