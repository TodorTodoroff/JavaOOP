package DefiningClassesT6.Exercise.RawData04;

public class Tire {
    private double tirePressure;
    private int tireAge;


    public Tire(double tirePressure, int tireAge) {
        this.tireAge = tireAge;
        this.tirePressure = tirePressure;

    }

    public double getTirePressure() {
        return tirePressure;
    }

    public int getTireAge() {
        return tireAge;
    }
}
