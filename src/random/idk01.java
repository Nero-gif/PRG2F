package random;

import java.util.Random;
import java.util.Scanner;

public class idk01 {
    public static int drawCard() {
        // Karty mají hodnoty od 1 do 11 (pro zjednodušení)
        Random rng = new Random();
        return rng.nextInt(11) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int dealerScore = 0;

        // Hráč si lízne dvě karty
        playerScore += drawCard();
        playerScore += drawCard();
        System.out.println("Hráč, tvoje skóre: " + playerScore);

        // Jednoduché rozhodnutí hráče
        System.out.print("Chceš další kartu? (ano/ne): ");
        String decision = scanner.nextLine();
        if (decision.equalsIgnoreCase("ano")) {
            playerScore += drawCard();
            System.out.println("Nové skóre: " + playerScore);
        }

        // Dealer si lízne dvě karty
        dealerScore += drawCard();
        dealerScore += drawCard();
        System.out.println("Dealerovo skóre: " + dealerScore);

        // Vyhodnocení výsledku
        if (playerScore > 21) {
            System.out.println("Hráč prohrál – přetáhl jsi!");
        } else if (dealerScore > 21 || playerScore > dealerScore) {
            System.out.println("Hráč vyhrál!");
        } else if (playerScore < dealerScore) {
            System.out.println("Dealer vyhrál!");
        } else {
            System.out.println("Remíza!");
        }

        scanner.close();
    }
}
