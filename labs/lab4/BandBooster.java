public class BandBooster {
    private String name;
    private int boxesSold;

    public BandBooster (String name) {
        this.name = name;
        this.boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales (int addBox) {
        boxesSold = boxesSold + addBox;
    }

    public String toString() {
        return name + " sold:  " + boxesSold + " boxes!";
    }
}