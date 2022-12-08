package Builder;

public class Director {

    public void constructCar(Builder builder) {
        builder.setVehicleType(VehicleType.CAR);
        builder.setEngine(new Engine(2.5, 0));
        builder.setSeats(4);
    }

    public void constructBus(Builder builder) {
        builder.setVehicleType(VehicleType.BUS);
        builder.setEngine(new Engine(5, 0));
        builder.setSeats(35);
    }
}
