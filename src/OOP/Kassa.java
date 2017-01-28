package OOP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jekaterina on 28.01.2017.
 */
public class Kassa {
    String nimi;
    ArrayList<String[]> tooded = new ArrayList<>();

    public Kassa(String kassapidaja) {
        nimi = kassapidaja;
    }

    public void lisaToode(String lisaToode) {
        String[] rida = new String[1];
        rida[0] = lisaToode;
        tooded.add(rida);
    }

    public void eemaldaToode(String eemaldaToode) {
        for (int i = 0; i < tooded.size(); i++) {
            if (tooded.get(i)[0].equals(eemaldaToode)) {
                tooded.get(i)[0] = "Toode on eemaldatud";
            }
        }
    }

    public void prindiOstutsekk() {
        for (int i = 0; i < tooded.size(); i++) {
            System.out.println(Arrays.toString(tooded.get(i)));
        }
    }

    public void prindiKassapidajaNimi() {
        System.out.println(nimi);
    }
}
