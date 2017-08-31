package Animals;

public class Gnu implements IDrinkable {

    private long herdCount = 0;

    public Gnu(int herdCount) {
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
        return 11;
    }
}
