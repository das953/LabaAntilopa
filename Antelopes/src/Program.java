import Savannah.Herd;
import Savannah.LifeCycle;
import Savannah.Oasis;


public class Program {
    public static void main(String[] args) {


        //1000000000    11
        //800000000     8
        //1500000000    5
        //24900000000 l\d ~80d
        //TestProbabilityFormula();
        LifeCycle lifeCycle  =
                new LifeCycle(
                        new Herd(1000000000,1500000000,800000000),
                        new Oasis(2000000000000l));

        lifeCycle.BeginLife();

    }





}
