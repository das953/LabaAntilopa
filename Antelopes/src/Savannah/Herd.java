package Savannah;
import Animals.*;

import java.util.*;


public class Herd {

    private List<IDrinkable> herds;


    public Herd(int gnusCount, int damasCount, int dorkasCount) {

        Gnu gnus = new Gnu(gnusCount);
        Dorkas dorkas = new Dorkas(dorkasCount);
        Dama damas = new Dama(damasCount);



        herds = new LinkedList<IDrinkable>();
        herds.add(gnus);
        herds.add(dorkas);
        herds.add(damas);

    }

    List<IDrinkable> getHerds() {
        return herds;
    }

}
