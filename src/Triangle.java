import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        System.out.println("Zadaj číslo");
        Scanner sc = new Scanner(System.in);
        int vyska = sc.nextInt();
        for (int i = 1; i <= vyska; i++) {
            for (int y = 0; y < i; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Nový");
        for (int i = 1; i <= vyska; i++) {
            for (int y = 0; y <= vyska - i; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y < i; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Nový");
        for (int i = 1; i <= vyska; i++) {
            for (int y = vyska - i; y >= 0; y--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Nový");
        for (int i = 1; i <= vyska; i++) {
            for (int y = 1; y < i; y++) {
                System.out.print(" ");
            }
            for (int y = vyska - i; y >= 0; y--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}