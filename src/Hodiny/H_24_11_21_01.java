package Hodiny;

public class H_24_11_21_01 {
    public static void main(String[] args) {
        int velikost = 8;

        for (int radek = 0; radek < velikost; radek++) {
            if (radek % 2 == 0) {
                for (int sloupec = 0; sloupec < velikost; sloupec++) {
                    if (sloupec % 2 == 0) {
                        System.out.print(" ☺ ");
                    } else {
                        System.out.print(" ☻ ");
                    }
                }
            }
            else{
                    for (int sloupec = 0; sloupec < velikost; sloupec++) {
                        if (sloupec % 2 == 0) {
                            System.out.print(" ☻ ");
                        } else {
                            System.out.print(" ☺ ");
                        }
                    }
                }
                System.out.println();

            }
        }
    }
