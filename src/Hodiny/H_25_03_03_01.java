package Hodiny;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class H_25_03_03_01 {
        // Příklad 1: Součet dvou čísel
        public static int soucet(int a, int b) {
            return a + b;
        }

        // Příklad 2: Kontrola, zda je číslo sudé
        public static boolean jeSude(int cislo) {
            return cislo % 2 == 0;
        }

        // Příklad 3: Vytvoření uvítací zprávy
        public static String uvita(String jmeno) {
            return "Ahoj, " + jmeno + "!";
        }

        // Příklad 4: Výpočet mocniny (rekurzivně)
        public static int mocnina(int zaklad, int exponent) {
            if (exponent == 0) {
                return 1;
            } else {
                return zaklad * mocnina(zaklad, exponent - 1);
            }
        }

        // Příklad 5: Výpočet faktoriálu (rekurzivně)
        public static int faktorial(int cislo) {
            if (cislo == 0) {
                return 1;
            } else {
                return cislo * faktorial(cislo - 1);
            }
        }

        // Příklad 6: Výpočet Fibonacciho čísla (rekurzivně)
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        // Příklad 7: Bubble sort – třídění pole metodou
        public static int[] bubbleSort(int[] pole) {
            int n = pole.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (pole[j] > pole[j + 1]) {
                        int temp = pole[j];
                        pole[j] = pole[j + 1];
                        pole[j + 1] = temp;
                    }
                }
            }
            return pole;
        }

        // Příklad 8: Zdvojnásobení hodnot v poli
        public static int[] zdvojnasobit(int[] pole) {
            for (int i = 0; i < pole.length; i++) {
                pole[i] *= 2;
            }
            return pole;
        }

        // Příklad 9: Filtrace pole – vrácení pouze sudých čísel
        public static int[] filtrujSudou(int[] pole) {
            List<Integer> seznam = new ArrayList<>();
            for (int i : pole) {
                if (i % 2 == 0) {
                    seznam.add(i);
                }
            }
            int[] vysledek = new int[seznam.size()];
            for (int i = 0; i < seznam.size(); i++) {
                vysledek[i] = seznam.get(i);
            }
            return vysledek;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            boolean repeat = true;
            while (repeat == true) {

                System.out.println("Zvolte akci.");
                System.out.println("1 = Součet dvou čísel");
                System.out.println("2 = Kontrola, zda je číslo sudé");
                System.out.println("3 = Vytvoření uvítací zprávy");
                System.out.println("4 = Výpočet mocniny");
                System.out.println("5 = Výpočet faktoriálu");
                System.out.println("6 = Výpočet Fibonacciho čísla");
                System.out.println("7 = Bubble sort");
                System.out.println("8 = Zdvojnásobení hodnot v poli");
                System.out.println("9 = Filtrace pole – vrácení pouze sudých čísel");
                int volba = sc.nextInt();

                int velikost;

                if (volba == 1) {
                    // Příklad 1: Součet dvou čísel
                    System.out.print("Zadejte první číslo pro součet: ");
                    int a = sc.nextInt();
                    System.out.print("Zadejte druhé číslo pro součet: ");
                    int b = sc.nextInt();
                    System.out.println("Součet čísel: " + soucet(a, b));
                } else if (volba == 2) {
                    // Příklad 2: Kontrola, zda je číslo sudé
                    System.out.print("Zadejte číslo pro kontrolu, zda je sudé: ");
                    int cislo = sc.nextInt();
                    System.out.println("Je číslo " + cislo + " sudé? " + jeSude(cislo));
                } else if (volba == 3) {
                    // Příklad 3: Vytvoření uvítací zprávy
                    System.out.print("Zadejte své jméno pro uvítání: ");
                    sc.nextLine();  // Vyčištění bufferu
                    String jmeno = sc.nextLine();
                    System.out.println(uvita(jmeno));
                } else if (volba == 4) {
                    // Příklad 4: Výpočet mocniny
                    System.out.print("Zadejte základ pro mocninu: ");
                    int zaklad = sc.nextInt();
                    System.out.print("Zadejte exponent pro mocninu: ");
                    int exponent = sc.nextInt();
                    System.out.println("Mocnina: " + mocnina(zaklad, exponent));
                } else if (volba == 5) {
                    // Příklad 5: Výpočet faktoriálu
                    System.out.print("Zadejte číslo pro výpočet faktoriálu: ");
                    int cisloFaktorial = sc.nextInt();
                    System.out.println("Faktoriál: " + faktorial(cisloFaktorial));
                } else if (volba == 6) {
                    // Příklad 6: Výpočet Fibonacciho čísla
                    System.out.print("Zadejte pořadí Fibonacciho čísla: ");
                    int n = sc.nextInt();
                    System.out.println("Fibonacciho číslo: " + fibonacci(n));
                } else if (volba == 7) {
                    // Příklad 7: Bubble sort
                    System.out.print("Zadejte počet prvků v poli pro třídění: ");
                    velikost = sc.nextInt();
                    int[] pole = new int[velikost];
                    System.out.println("Zadejte hodnoty do pole:");
                    for (int i = 0; i < velikost; i++) {
                        pole[i] = sc.nextInt();
                    }
                    int[] setrideno = bubbleSort(pole);
                    System.out.print("Setříděné pole: ");
                    for (int i : setrideno) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                } else if (volba == 8) {
                    // Příklad 8: Zdvojnásobení hodnot v poli
                    System.out.print("Zadejte počet prvků v poli pro zdvojnásobení: ");
                    velikost = sc.nextInt();
                    int[] pole2 = new int[velikost];
                    System.out.println("Zadejte hodnoty do pole:");
                    for (int i = 0; i < velikost; i++) {
                        pole2[i] = sc.nextInt();
                    }
                    int[] upraveno = zdvojnasobit(pole2);
                    System.out.print("Zdvojnásobené hodnoty: ");
                    for (int i : upraveno) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                } else if (volba == 9) {
                    // Příklad 9: Filtrace pole – vrácení pouze sudých čísel
                    System.out.print("Zadejte počet prvků v poli pro filtraci: ");
                    velikost = sc.nextInt();
                    int[] pole3 = new int[velikost];
                    System.out.println("Zadejte hodnoty do pole:");
                    for (int i = 0; i < velikost; i++) {
                        pole3[i] = sc.nextInt();
                    }
                    int[] filtr = filtrujSudou(pole3);
                    System.out.print("Filtr: ");
                    for (int i : filtr) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Zvolene neplatná možnost!");
                }
                System.out.println("Chcete provést další akci? 1 = Ano, 0 = Ne");
                int rep = sc.nextInt();
                if (rep == 1){
                    repeat = true;
                }else {
                    repeat = false;
                }
            }
        }

}
