package Builder;


import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void CheckCarBuilderGetType() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCar(carBuilder);
        Car car = carBuilder.getResult();

        assertEquals(car.getType(), VehicleType.CAR);

        System.out.println("CarBuilder First Test: Passed");
    }

    @Test
    public void CheckBusBuilderGetType() {
        Director director = new Director();

        BusBuilder busBuilder = new BusBuilder();
        director.constructBus(busBuilder);
        Bus bus = busBuilder.getResult();

        assertEquals(bus.getType(), VehicleType.BUS);

        System.out.println("BusBuilder First Test: Passed");
    }

    @Test
    public void CheckCarBuilderGetEngine() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCar(carBuilder);
        Car car = carBuilder.getResult();

        assertEquals("Car Engine Volume was not correct.", car.getEngine().getVolume(), 2.5, 0.0);
        assertEquals(car.getEngine().getMileage(), 0);

        System.out.println("CarBuilder Second Test: Passed");
    }

    @Test
    public void CheckBusBuilderGetEngine() {
        Director director = new Director();

        BusBuilder busBuilder = new BusBuilder();
        director.constructBus(busBuilder);
        Bus bus = busBuilder.getResult();

        assertEquals("Bus Engine Volume was not correct.", bus.getEngine().getVolume(), 5.0, 0.0);
        assertEquals(bus.getEngine().getMileage(), 0);
        
        System.out.println("BusBuilder Second Test: Passed");
    }

    @Test
    public void CheckCarBuilderGetSeats() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCar(carBuilder);
        Car car = carBuilder.getResult();

        assertEquals(car.getSeats(), 4);

        System.out.println("CarBuilder Third Test: Passed");
    }

    @Test
    public void CheckBusBuilderGetSeats() {
        Director director = new Director();

        BusBuilder busBuilder = new BusBuilder();
        director.constructBus(busBuilder);
        Bus bus = busBuilder.getResult();

        assertEquals(bus.getSeats(), 35);

        System.out.println("BusBuilder Third Test: Passed");
    }

    @Test
    public void CheckCarBuilderSetAndGetSeats() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCar(carBuilder);
        carBuilder.setSeats(5);
        Car car = carBuilder.getResult();

        assertEquals(car.getSeats(), 5);

        System.out.println("CarBuilder Fourth Test: Passed");
    }

    @Test
    public void CheckBusBuilderSetAndGetSeats() {
        Director director = new Director();

        BusBuilder busBuilder = new BusBuilder();
        director.constructBus(busBuilder);
        busBuilder.setSeats(42);
        Bus bus = busBuilder.getResult();

        assertEquals(bus.getSeats(), 42);

        System.out.println("BusBuilder Fourth Test: Passed");
    }
}
