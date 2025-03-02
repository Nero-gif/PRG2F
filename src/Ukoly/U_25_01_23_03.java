package Ukoly;

import java.util.Scanner;

public class U_25_01_23_03 {
    static String validateNick(String nick, String jmeno, String prij){
        String idk = String.valueOf(123456789);
        jmeno = jmeno + idk;
        prij = prij +idk;
        for (int i = 0; i < 3; i++) {
            nick = nick + jmeno.charAt(i);
        }
        for (int i = 0; i < 3; i++) {
            nick = nick + prij.charAt(i);
        }

        return nick;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte jméno.");
        String jmeno = sc.next();
        System.out.println("Zadejte přijímení");
        String prij = sc.next();

        String nick = "";

        nick = validateNick(nick, jmeno, prij);

        System.out.println("Doporučený nick je "+nick);
    }

}
