package Builder;

public class Car {
    private final VehicleType type;
    private final Engine engine;
    private final int seats;

    public Car(VehicleType type, Engine engine, int seats) {
        this.type = type;
        this.engine = engine;
        this.seats = seats;
    }

    public VehicleType getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }
}
