package AbstractFactory;

public abstract class Garden {
    Garden(GardenType model, Location location) {
        this.model = model;
        this.location = location;
    }

    abstract void construct();

    GardenType model = null;
    Location location = null;

    public GardenType getModel() {
        return model;
    }

    void setModel(GardenType model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "GardenModel - " + model + " located in " + location;
    }
}
