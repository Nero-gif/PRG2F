package hodina4;
import java.util.Scanner;
public class Ukol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik je vám let");
        int vek = sc.nextInt();
        System.out.println("Kolik stojí lístek v základní ceně");
        int cena = sc.nextInt();
        if (vek >=1 && vek <=12 && vek >=70){
            int cena2 = cena-((cena/100)*40);
            System.out.println("Cena lístku je "+cena2);
        } else if (vek>=13 && vek<=18) {
            int cena2 = cena-((cena/100)*20);
            System.out.println("Cena lístku je "+cena2);
            
        }else {
            System.out.println("Cena lístku je "+cena);
        }
    } 
    }
