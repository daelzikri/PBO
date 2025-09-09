package week3.perhitungan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.print("Masukkan angka pertama (a): ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua (b): ");
        int b = scanner.nextInt();

        kalkulator.tambah(a, b);
        kalkulator.kali(a, b);

        int hasil = kalkulator.kali2(a, b);
        System.out.println("Hasil kali2 (return): " + hasil);

        scanner.close();
    }
}