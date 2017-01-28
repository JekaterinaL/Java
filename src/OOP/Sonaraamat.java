package OOP;

import java.util.ArrayList;

/**
 * Created by Jekaterina on 28.01.2017.
 */
public class Sonaraamat {
    ArrayList<String> sonad = new ArrayList();
    private String keel;

    public Sonaraamat(String raamatuKeel) {
        keel = raamatuKeel;
    }

    public void sisestaSona(String sona) {
        sonad.add(sona);
    }

    public String[] otsiEsimeseTaheJargi(String taht) {
        char esimeneTaht = taht.charAt(0);
        ArrayList<String> otsitavTaht = new ArrayList<>();
        for (int i = 0; i < sonad.size(); i++) {
            if (sonad.get(i).charAt(0) == esimeneTaht){
                String tahegaSona = sonad.get(i);
                otsitavTaht.add(tahegaSona);
                
            }
        }
        String[] otsitavTahtString = new String[otsitavTaht.size()];
        for (int i = 0; i < otsitavTaht.size(); i++) {
            otsitavTahtString[i] = otsitavTaht.get(i);
        }
        return otsitavTahtString;
    }

    public void eemaldaSona(String sona) {
        sonad.remove(sona);
    }

    public void misKeelesRaamatOn() {
        System.out.println(keel);
    }
}
