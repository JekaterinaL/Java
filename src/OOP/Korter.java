package OOP;

/**
 * Created by Jekaterina on 28.01.2017.
 */
public class Korter {

    int kylalised;
    int maksimaalseltMahub;

    public Korter(int mahutab) {
        maksimaalseltMahub = mahutab;
    }

    public void saabus(String nimi) {
        if (kylalised < maksimaalseltMahub) {
            kylalised++;
        }
    }

    public void prindiKylalisteArv() {
        System.out.println("Külaliste arv on " + kylalised);
    }

    public void prindiPaljuVeelMahub() {
        if (kylalised < maksimaalseltMahub) {
            System.out.println("Mahub veel: " + (maksimaalseltMahub - kylalised));
        }
    }

    public void lahkus(String nimi) {
        kylalised--;
    }
}
