package Test;
import java.util.Scanner;
public class Ukol_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik Kg vážíte?");
        int vaha = sc.nextInt();

        if (vaha < 100){
            System.out.println("Můžete běžet v závodě.");
        }
        else {
            System.out.println("Nemůžete běžet v závodě.");
        }
    }
}
