package Savannah;

import Animals.IDrinkable;

import java.util.List;

public class LifeCycle {

    private Herd herds;
    private Oasis oasis;

    public LifeCycle(Herd herds, Oasis oasis) {
        this.herds = herds;
        this.oasis = oasis;

    }

    public void BeginLife(){
        int day = 0;

        while (true) {
            if(!IsThereNextDay())
                break;
            day++;
            nextDay(day);

            System.out.println("On begin of day herds size is: ");
            for (IDrinkable herd  : herds.getHerds()){
                System.out.printf(herd.getHerdCount() + " | ");
            }

        }

        System.out.println("\nAll died on " + day + "day");
    }

    private boolean IsThereNextDay(){
        int deadHerdsCount = 0;
        for (IDrinkable herd : herds.getHerds()){
            if(herd.getHerdCount() == 0)
                deadHerdsCount++;
        }

        return !(deadHerdsCount == herds.getHerds().size());
    }

    private void nextDay(int dayNumber){

        for (IDrinkable herd  : herds.getHerds()){

            int i = 0;
            if(herd.getHerdCount() * herd.Drink() <= oasis.getOasisWater()){
                oasis.setOasisWater(oasis.getOasisWater() - (herd.getHerdCount() * herd.Drink()));
                continue;
            }
            else if(herd.getHerdCount() * herd.Drink() * 0.75 <= oasis.getOasisWater()){
                oasis.setOasisWater(oasis.getOasisWater() - (int)(herd.getHerdCount() * herd.Drink() * 0.75));
                continue;
            }
            else if(herd.getHerdCount() * herd.Drink() * 0.5 <= oasis.getOasisWater()){
                oasis.setOasisWater(oasis.getOasisWater() - (int)(herd.getHerdCount() * herd.Drink() * 0.5));
                continue;
            }
            else if(herd.getHerdCount() * herd.Drink() * 0.25 <= oasis.getOasisWater()){
                oasis.setOasisWater(oasis.getOasisWater() - (int)(herd.getHerdCount() * herd.Drink() * 0.25));
                continue;
            }
            else if(herd.getHerdCount() * herd.Drink() * 0.1 <= oasis.getOasisWater()){
                oasis.setOasisWater(oasis.getOasisWater() - (int)(herd.getHerdCount() * herd.Drink() * 0.1));
                continue;
            }
            else if(herd.getHerdCount() * herd.Drink() * 0.05 <= oasis.getOasisWater()){
                oasis.setOasisWater(oasis.getOasisWater() - (int)(herd.getHerdCount() * herd.Drink() * 0.05));
                continue;
            }


            for ( ; i < herd.getHerdCount(); i++) {

                oasis.setOasisWater(oasis.getOasisWater() - herd.Drink());

                if(!OasisHasWater()){
                    herd.setHerdCount(i);
                }

            }


        }





        if(oasis.getOasisWater() < 0 )
            oasis.setOasisWater(0);
        oasis.WaterOnNextDay(dayNumber);
    }

    private boolean OasisHasWater(){
        return oasis.getOasisWater() > 0;
    }
}
