package AbstractFactory;

public class GardenCreator {

    public static Garden creatGarden(GardenType type, Location location) {
        Garden garden = null;
        // use location specific garden creator

        switch (location) {
            case Iranian:
                garden = IranianGardenCreator.createGarden(type);
                break;

            case Japanese:
                garden = JapaneseGardenCreator.createGarden(type);
                break;

            default:
                garden = null;

        }
        return garden;
    }
}
