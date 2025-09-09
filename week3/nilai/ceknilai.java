package week3.nilai;

public class ceknilai {
    public void periksa(int a) {
        if (a > 100 || a < 0) {
            System.out.println("Nilai tidak valid");
            return;
        }

        if (a >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        if (a >= 85) {
            System.out.println("Grade: A");
        } else if (a >= 70) {
            System.out.println("Grade: B");
        } else if (a >= 60) {
            System.out.println("Grade: C");
        } else if (a >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
    }

}
