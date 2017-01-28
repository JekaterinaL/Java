package OOP;

/**
 * Created by Jekaterina on 28.01.2017.
 */
public class Pastakas {

    int kogus;

    public Pastakas(int tindiKogus) {
        kogus = tindiKogus;
        System.out.println(kogus);
    }

    public void kirjuta(String s) {
        kogus = kogus - s.length();
    }

    public void prindiPaljuTintiAlles() {
        System.out.println("Alles on " + kogus + " tindi");
    }
}
