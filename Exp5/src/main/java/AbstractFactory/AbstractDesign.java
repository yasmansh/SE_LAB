package AbstractFactory;

public class AbstractDesign {
    public static void main(String[] args) {
        // Currently I'm just using Iranian as Location
        System.out.println(GardenCreator.creatGarden(GardenType.Tree, Location.Iranian));
        System.out.println(GardenCreator.creatGarden(GardenType.Flower, Location.Iranian));
    }
}
