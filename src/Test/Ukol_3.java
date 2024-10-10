package Test;

import java.util.Scanner;

public class Ukol_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte objem vody v litrech.");
        int voda = sc.nextInt();

        if (voda <= 1000){
            int cena = voda*2;
            System.out.println("Zaplatíte "+cena+" CZK");
        } else if (voda <= 5000) {
            double cena = voda*1.8;
            System.out.println("Zaplatíte "+cena+" CZK");
        } else if (voda <= 10000) {
            double cena = voda*1.5;
            System.out.println("Zaplatíte "+cena+" CZK");
        }else{
            double cena = voda*1.2;
            System.out.println("Zaplatíte "+cena+" CZK");
        }
    }
}
