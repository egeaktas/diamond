// * işareti ile elmas şekli çıkarmak (İstenilen basamak sayısına göre)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamak, n, sayac = 0;
        System.out.print("Basamak miktarını giriniz (tek sayı): ");
        basamak = input.nextInt();
        n = (basamak + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int k = (n - i); k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = (n - 1); i > 0; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
