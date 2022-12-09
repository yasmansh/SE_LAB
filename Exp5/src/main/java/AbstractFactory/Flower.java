package AbstractFactory;

public class Flower extends Garden {
    Flower(Location location) {
        super(GardenType.Flower, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to flower");
    }
}
