/* Aisyah Safira Rachman */
/* 13020210004 */

import java.util.Scanner;

public class Hitung0004 {
    public static void main(String[] args) {
        final double MIL_TO_METER = 1609.0; // satu mil dalam meter
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak dalam mil: ");
        double mil = input.nextDouble();
        double meter = mil * MIL_TO_METER; // konversi mil ke meter
        System.out.printf("%.3f mil = %.3f meter", mil, meter);
    }
}
