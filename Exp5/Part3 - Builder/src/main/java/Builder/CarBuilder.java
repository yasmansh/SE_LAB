package Builder;

public class CarBuilder implements Builder {
    private VehicleType type;
    private Engine engine;
    private int seats;

    @Override
    public void setVehicleType(VehicleType type) {
        this.type = type;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car getResult() {
        return new Car(type, engine, seats);
    }
}
