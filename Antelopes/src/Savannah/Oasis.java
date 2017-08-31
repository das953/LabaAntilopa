package Savannah;

import java.util.Random;

public class Oasis {

    private long oasisWater;

    public Oasis(long oasisCapacity) {

        this.oasisWater = oasisCapacity;
    }

    public long WaterOnNextDay(int dayNumber){
        return RainyDay(11, dayNumber, oasisWater) ? (oasisWater+=1000000000) : oasisWater;
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
        boolean isRain = new Random().nextInt(100 / rainPercentage) == 0;
        System.out.println("On "
                + dayNumber
                + (isRain ? " it was raining." : " there was no rain.")
                + " Now oasis has " + oasisWater + " liters of water");
        return isRain;
    }

    public void setOasisWater(long oasisWater) {
        this.oasisWater = oasisWater;
    }

    public long getOasisWater() {
        return oasisWater;
    }
}
