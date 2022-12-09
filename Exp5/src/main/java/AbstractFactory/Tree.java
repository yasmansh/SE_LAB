package AbstractFactory;

public class Tree extends Garden {
    Tree(Location location) {
        super(GardenType.Tree, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to tree");
    }
}
