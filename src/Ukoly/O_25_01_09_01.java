package Ukoly;

import java.util.Scanner;

public class O_25_01_09_01 {

        static void validatePassword(String password) {
            boolean isValid = true;
            if (password.length() < 8) {
                System.out.println("Heslo nesplňuje jednu z podmínek: \"délka\"");
                isValid = false;
            }else if (password.toLowerCase().contains("heslo")) {
                System.out.println("Heslo nesplňuje jednu z podmínek: \"obsahuje zakázané slovo\"");
                isValid = false;
            }else if (!password.matches(".*[A-Z].*")) {
                System.out.println("Heslo nesplňuje jednu z podmínek: \"neobsahuje velké písmeno\"");
                isValid = false;
            }else if (isValid) {
                System.out.println("Heslo je v pořádku");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Zadejte heslo.");
            System.out.println("Heslo musí být dlouhé alespoň 8 znaků.");
            System.out.println("Heslo nesmí obsahovat slovo \"heslo\".");
            System.out.println("Heslo musí obsahovat alespoň jedno velké písmeno.");
            String password = sc.next();

            validatePassword(password);
        }

}
