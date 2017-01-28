package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 *
 */
public class Kikilips {
    public static void main (String[] args) {
        int[][] laud = new int[4][4];
        for (int i = -laud.length; i <= laud.length; i++) {
            for (int j = -laud.length; j <= laud.length; j++) {
                if (i * i <= j * j) {
                    System.out.printf("%2d", 0);
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println();
        }
    }
}
