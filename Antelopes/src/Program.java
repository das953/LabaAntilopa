import Animals.*;
import Savannah.Herd;
import Savannah.LifeCycle;
import Savannah.Oasis;

import java.util.*;


public class Program {
    public static void main(String[] args) {



      //TestProbabilityFormula();
        LifeCycle lifeCycle  =
                new LifeCycle(
                        new Herd(1000000000,1500000000,800000000),
                        new Oasis(2000000000000l));

        lifeCycle.BeginLife();

    }





}
