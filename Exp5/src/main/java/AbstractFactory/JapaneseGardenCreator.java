package AbstractFactory;

public class JapaneseGardenCreator {
    static Garden createGarden(GardenType model) {
        Garden garden = null;
        switch (model) {
            case Flower:
                garden = new Flower(Location.Japanese);
                break;

            case Tree:
                garden = new Tree(Location.Japanese);
                break;

            default:
                break;

        }
        return garden;
    }
}
