import java.util.Scanner;

public class Interval {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj pravou mez 1.intervalu");
        int interval1Min = sc.nextInt();
        System.out.println("Zadaj lavu mez 1.intervalu");
        int interval1Max = sc.nextInt();

        System.out.println("Zadaj pravou mez 2.intervalu");
        int interval2Min = sc.nextInt();
        System.out.println("Zadaj lavu mez 2.intervalu");
        int interval2Max = sc.nextInt();

        for (int i = interval1Min; i < interval1Max; i++) {
            for (int y = interval2Min; y < interval2Max; y++) {
                int sum = i + y;
                if (( sum >= interval1Min && sum <= interval1Max) || ( sum >= interval2Min && sum <= interval2Max)){
                    System.out.print(String.format("[%d;%d], ", i, y));
                }
            }
            System.out.println("");
        }
    }
    }
