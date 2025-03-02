package Ukoly;
import java.util.Arrays;
import java.util.Scanner;

public class U_25_03_02_01 {
    public static void main(String[] args) {
        String[] inventory = {
                "Spitzhacke",
                "Krankenwagen",
                "Apache-Hubschrauber 3000",
                "Monchhichi",
                "Chihuahua",
                "Gallone Milch",
                "Hubba Bubba",
                "48-Port-Switch",
                "Stiefel",
                "Schwanz eines weißen Wals",
                "DVD-Player",
                "16GB RAM",
                "LGM 30 Minuteman",
                "Lego Ninja Go",
                "Excalibur",
                "50-Meter-Seil",
                "Quanten-Discombobulator",
                "Empfindungsfähiges Gummiente",
                "Unsichtiges Glücks-Frettchen",
                "Zeitreisender Hamster",
                "Kosmische Luftpolsterfolie",
                "Telepathischer Spatel",
                "Interdimensionales Käserad",
                "Verzerrte Lavalampe",
                "Tanzender Kaktus des Chaos",
                "Mystische Fleischkugel",
                "Einhornfürze im Glas",
                "Singender Weltraum-Taco",
                "Antischwerkraft-Banane",
                "Multiversum-Becher",
                "Hellseherischer Toaster",
                "Atom-Schaumbad"
        };
        char[] rarity = {'C', 'D', 'D', 'D', 'B', 'A', 'D', 'E', 'E', 'E', 'A', 'E', 'D', 'A', 'E', 'D', 'A', 'A', 'D', 'A', 'E', 'D', 'E', 'B', 'C', 'C', 'A', 'B', 'C', 'C', 'E', 'E'};

        Scanner sc = new Scanner(System.in);

        boolean Repeat = true;
        while (Repeat) {
            System.out.println("Zvolte akci:");
            System.out.println("1 = Zadat 4 nové songy");
            System.out.println("2 = Vypsat inventář");
            System.out.println("3 = Seřadit a vypsat inventář podle abecedy");
            System.out.println("4 = Seřadit a vypsat inventář podle rarity");
            int akce = sc.nextInt();

            if (akce == 1) {
                inventory = AddItem(inventory);
                rarity = AddRarity(sc, inventory, rarity, inventory.length - 4, inventory.length);
            } else if (akce == 2) {
                printInventory(inventory, rarity);
            } else if (akce == 3) {
                SortAlph(inventory, rarity);
                System.out.println("Inventář seřazený podle abecedy:");
                printInventory(inventory, rarity);
            } else if (akce == 4) {
                SortRarity(inventory, rarity);
                System.out.println("Inventář seřazený podle rarity:");
                printInventory(inventory, rarity);
            } else {
                System.out.println("Zvolena naplatná hodnota");
            }

            System.out.println("Chcete provést další akci? 0 = no, 1 = yes");
            int rep = sc.nextInt();
            System.out.println(rep);
            if (rep == 1){
                Repeat = true;
                System.out.println("Byla zvolena možnost 'yes'");
            }else {
                Repeat = false;
                System.out.println("Byla zvolena možnost 'no'");
            }
        }
    }

    private static String[] AddItem(String[] inventory) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Zadejte název nového songu:");
            String newItem = sc.nextLine();

            inventory = Arrays.copyOf(inventory, inventory.length + 1);
            inventory[inventory.length - 1] = newItem;
        }
        return inventory;
    }

    private static char[] AddRarity(Scanner sc, String[] inventory, char[] rarity, int startIndex, int endIndex) {
        char[] newRarity = Arrays.copyOf(rarity, endIndex);

        for (int i = startIndex; i < endIndex; i++) {
            System.out.println("Zadejte raritu pro položku " + inventory[i] + " (A-E):");
            char newRarityValue = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            newRarity[i] = newRarityValue;
        }
        return newRarity;
    }

    private static void SortAlph(String[] inventory, char[] rarity) {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - i - 1; j++) {
                if (inventory[j].compareTo(inventory[j + 1]) > 0) {
                    String tempItem = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = tempItem;

                    char tempRarity = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = tempRarity;
                }
            }
        }
    }

    private static void SortRarity(String[] inventory, char[] rarity) {
        for (int i = 0; i < rarity.length - 1; i++) {
            for (int j = 0; j < rarity.length - i - 1; j++) {
                if (rarity[j] > rarity[j + 1] || (rarity[j] == rarity[j + 1] && inventory[j].compareTo(inventory[j + 1]) > 0)) {
                    String tempItem = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = tempItem;

                    char tempRarity = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = tempRarity;
                }
            }
        }
    }

    private static void printInventory(String[] inventory, char[] rarity) {
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(String.format("%02d Song: %s, Rarita: %s", (i + 1), inventory[i], rarity[i]));
        }
    }
}