package Ukoly190924;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš číslo");
        int Nevim = sc.nextInt();
        System.out.println("Napiš další číslo");
        int IDK = sc.nextInt();
        int IchWeisNicht;
        System.out.println("Nevim="+Nevim+", IDK="+IDK);
        IchWeisNicht = Nevim;
        Nevim = IDK;
        IDK = IchWeisNicht;
        System.out.println("Nevim="+Nevim+", IDK="+IDK);
    }
}
