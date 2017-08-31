package Savannah;

import java.util.Random;

public class Oasis {

    private long oasisWater;

    public Oasis(long oasisCapacity) {

        this.oasisWater = oasisCapacity;
    }

    void WaterOnNextDay(int dayNumber){
        boolean isRain = RainyDay(11, dayNumber, oasisWater);
        if (isRain) {
            oasisWater += 1000000000;
        }
        System.out.println("On "
                + dayNumber
                + (isRain ? " day it was raining." : " day there was no rain.")
                + " At the end of day oasis has " + oasisWater + " liters of water.");
    }

    private static void TestProbabilityFormula(){
        int [] randomTest = new int[10000];


        for (int j = 0; j < randomTest.length; j++) {
            int truecount = 0;

            for (int i = 0; i < 100; i++) {


                boolean rain = RainyDay(11, 0,0);
                if (rain)
                    truecount++;
            }
            randomTest[j] = truecount;
        }

        int average = 0;
        for ( int value : randomTest){
            average+=value;
        }
        average = average / randomTest.length;

        System.out.println("Average result is " + average + "%");
    }

    private static boolean RainyDay(int rainPercentage, int dayNumber, long oasisWater){
        return  new Random().nextInt(100 / rainPercentage) == 0;
    }

    void setOasisWater(long oasisWater) {
        this.oasisWater = oasisWater;
    }

    long getOasisWater() {
        return oasisWater;
    }
}
