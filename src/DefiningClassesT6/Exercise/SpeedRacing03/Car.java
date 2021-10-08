package DefiningClassesT6.Exercise.SpeedRacing03;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostForOneKilometer;
    private int distanceTraveled = 0;

    public Car(String model, double fuelAmount, double fuelCostForOneKilometer) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostForOneKilometer = fuelCostForOneKilometer;

    }

    public boolean drive(double distance) {
        double fuelRequired = distance * fuelCostForOneKilometer;
        if (fuelRequired > this.fuelAmount) {
            return false;
        } else {
            this.fuelAmount -= fuelRequired;
            this.distanceTraveled += distance;
            return true;
        }

    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
