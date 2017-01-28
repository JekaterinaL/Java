package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main (String[] args){
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        //System.out.println(Arrays.toString(naide));

        //System.out.println(naide.length); - 5

         int count = 0;
         while (count < naide.length) {
         //System.out.println(naide[count]); - using while
         count = count + 1;
         }

         for (int i = 0; i < naide.length; i++) {
         //System.out.println(naide[i]); - sõnad prinditakse eraldi
         }


        //Lahendus algab siit
        int sum = 0;
        int average = 0;
        for (int i = 0; i < naide.length; i++) {
            //System.out.println(naide[i].length());
            sum = sum + naide[i].length();
        }
        //System.out.println(sum);
        average = sum / naide.length;
        //System.out.println(average);

        int count2 = 0;
        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length() > average){
                count2++;
            }
        }
        System.out.println(count2);
    }
}
