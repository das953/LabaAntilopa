package Animals;

public class Dorkas implements IDrinkable {

    private long herdCount = 0;

    public Dorkas(int herdCount) {
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
        return 8;
    }
}
