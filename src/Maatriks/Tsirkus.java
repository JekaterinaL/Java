package Maatriks;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Loo 10*10 maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad alt vasakult ja jõuavad üles vasakule.
 *
 * Näide 5*5 laual:
 * 30 29 28 27 26
 * 21 22 23 24 25
 * 20 19 18 17 16
 * 11 12 13 14 15
 * 10 9  8  7  6
 * 1  2  3  4  5
 */
public class Tsirkus {
    public static void main(String[] args) {
        int counter = 100;
        int change = 9;

        for (int j = 1; j < 11; j++) {
            for (int i = 9; i > -1; i--) {
                if (j%2 == 1) {
                    System.out.printf("%4d", counter);
                    counter--;
                } else if (j%2 == 0){
                    System.out.printf("%4d", (counter - change));
                    counter--;
                    change = change - 2;
                }
            }
            change = 9;
            System.out.println();
        }
    }
}
