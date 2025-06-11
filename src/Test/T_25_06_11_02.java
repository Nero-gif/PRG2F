package Test;
import java.util.Scanner;
public class T_25_06_11_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cisla = new int[n];
        for (int i = 0; i < n; i++) {
            cisla[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(cisla[i]);
        }
    }
}
