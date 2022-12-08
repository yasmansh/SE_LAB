package Builder;

public class BusBuilder implements Builder {
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

    public Bus getResult() {
        return new Bus(type, engine, seats);
    }
}
