package OOP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jekaterina on 28.01.2017.
 */
public class Chat {
    String nimi;
    ArrayList<String[]> sonumid = new ArrayList<>();

    public Chat(String toaNimi) {
        nimi = toaNimi;
    }

    public void sisestaSonum(String nimi, String sonum) {
        String[] rida = new String[2];
        rida[0] = nimi;
        rida[1] = sonum;
        sonumid.add(rida);
    }

    public void prindiKoikSonumidKoosKasutajanimega() {
        for (int i = 0; i < sonumid.size(); i++) {
            System.out.println(Arrays.toString(sonumid.get(i)));
        }
    }

    public void adminKustutabSonumi(String kustutavSonum) {
        for (int i = 0; i < sonumid.size(); i++) {
            if (sonumid.get(i)[1].equals(kustutavSonum)) {
                sonumid.get(i)[1] = "Sõnum on eemaldatud";
            }
            System.out.println();
        }
    }

    public void prindiToaNimi() {
        System.out.println(nimi);
    }
}
