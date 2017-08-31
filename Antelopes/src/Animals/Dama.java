package Animals;

public class Dama implements IDrinkable {

    private long herdCount = 0;

    public Dama(int herdCount) {
        this.herdCount = herdCount;
    }

    @Override
    public void setHerdCount(int number) {
        herdCount = number;
    }

    @Override
    public long getHerdCount() {
        return herdCount;
    }

    @Override
    public int Drink() {
        return 5;
    }

}
