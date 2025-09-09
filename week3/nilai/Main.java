package week3.nilai;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ceknilai nilai = new ceknilai();

        System.out.print("Input nilai (0-100): ");
        int a = scanner.nextInt();
        nilai.periksa(a);
        scanner.close();

    }
}
