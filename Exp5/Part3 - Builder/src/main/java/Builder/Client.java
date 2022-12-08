package Builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built:\t" + car.getType());

        BusBuilder busBuilder = new BusBuilder();
        director.constructBus(busBuilder);
        Bus bus = busBuilder.getResult();
        System.out.println("Bus built:\t" + bus.getType());

    }
}
