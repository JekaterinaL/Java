package OOP;

/**
 * Created by Jekaterina on 28.01.2017.
 */
public class Zelda {

    int elu;

    public Zelda(int elusid) {
        elu = elusid;
        System.out.println(elu);
    }

    public void kaklusKolliga(int kollilElusid) {
        elu = elu - kollilElusid;
        System.out.println("Kaklus kolliga");
    }

    public void prindiMituEluAlles() {
        System.out.println("Alles on " + elu + " elu." );
    }

    public void prindiKasOnElus() {
        if (elu > 0) {
            System.out.println("Zelda on elus!");
        } else {
            System.out.println("Zelda on surnud!");
        }
    }
}
