package Test;

import java.util.Arrays;

public class T_25_06_11_01 {
    public static void main(String[] args) {
        int[] cisla;
        cisla = new int[]{10, 2, 5, 25, 54, 24, 88, 8, 9, 7};

        for (int i = 0; i < cisla.length; i++) {
            System.out.println(cisla[i]);
        }
        for (int i = 0; i < cisla.length; i++) {
            System.out.println(cisla[cisla.length-1-i]);
        }
    }
}
