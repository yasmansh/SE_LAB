package AbstractFactory;

public class IranianGardenCreator {
    static Garden createGarden(GardenType model) {
        Garden garden = null;
        switch (model) {
            case Flower:
                garden = new Flower(Location.Iranian);
                break;

            case Tree:
                garden = new Tree(Location.Iranian);
                break;

            default:
                break;

        }
        return garden;
    }
}
