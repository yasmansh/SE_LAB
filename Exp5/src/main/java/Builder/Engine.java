package Builder;

public class Engine {
    private double volume;
    private int mileage;

    public Engine(double volume, int mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }
}
