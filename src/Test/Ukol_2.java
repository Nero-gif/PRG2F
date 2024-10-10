package Test;
import java.util.Random;
public class Ukol_2 {
    public static void main(String[] args) {
        Random sc = new Random();

        int Coin1 = sc.nextInt(0,2);
        int Coin2 = sc.nextInt(0,2);
        int Coin3 = sc.nextInt(0,2);
        //0 = Orel, 1 = Hlava
        System.out.println("Mince1="+Coin1+", Mince2="+Coin2+" a Mince3="+Coin3);

        int Coins = Coin1+Coin2+Coin3;
        if (Coins >= 2){
            System.out.println("Vyhráváte");
        }
        else{
            System.out.println("Prohráváte");
        }
    }
}
