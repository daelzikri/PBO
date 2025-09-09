package week3.perulangan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah perulangan: ");
        int n = scanner.nextInt();

        System.out.println("\nPerulangan for:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Iterasi ke-" + i);
        }

        System.out.println("\nPerulangan while:");
        int j = 1;
        while (j <= n) {
            System.out.println("Iterasi ke-" + j);
            j++;
        }

        System.out.println("\nPerulangan do-while:");
        int k = 1;
        do {
            System.out.println("Iterasi ke-" + k);
            k++;
        } while (k <= n);

        scanner.close();
    }
}
