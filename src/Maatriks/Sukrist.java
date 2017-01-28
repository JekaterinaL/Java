package Maatriks;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tagurpidi Tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad ülevalt paremalt ja jõuavad alla paremale (või kui kaugele iganes).
 *
 * Näide 5*5 laual:
 *  5  4  3  2  1
 *  6  7  8  9 10
 * 15 14 13 12 11
 * 16 17 18 19 20
 * 25 24 23 22 21
 * 26 27 28 29 30
 */
public class Sukrist {
    public static void main(String[] args) {
        int counter = 1;
        int change = -9;


        for (int j = 1; j < 11; j++) {
            for (int i = 9; i > -1; i--) {
                if (j%2 == 0) {
                    System.out.printf("%4d", counter);
                    counter++;
                } else if (j%2 == 1){
                    System.out.printf("%4d", (counter - change));
                    counter++;
                    change  = change  + 2;
                }

            }
            change  = -9;
            System.out.println();
        }
    }
}
