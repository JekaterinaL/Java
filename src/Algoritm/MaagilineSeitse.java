package Algoritm;

import java.util.Arrays;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        for (int i = 0; i < naide.length; i++){
            if (naide[i] == 7){
                naide[i] = naide[i]*2; //kõik seitsmed on korrutatud kahega
            }
        }
        //System.out.println(Arrays.toString(naide));

        int sum = 0;
        int average = 0;
        for (int i = 0; i < naide.length; i++) {
            sum = sum + naide[i];
        }
        //System.out.println(sum); - 552
        average = sum / naide.length; //arvude keskmine
        System.out.println(average);
    }
}
