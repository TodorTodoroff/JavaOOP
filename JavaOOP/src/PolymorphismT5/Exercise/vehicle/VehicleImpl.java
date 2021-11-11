package PolymorphismT5.Exercise.vehicle;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;

    public VehicleImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void refuel(double fuelRefueled) {
        this.fuelQuantity += fuelRefueled;
    }

    @Override
    public String drive(double kilometers) {
        double fuelNeeded = kilometers * fuelConsumption;
        if (fuelNeeded > this.getFuelQuantity()) {
            return this.getClass().getSimpleName() + " needs refueling";
        }
        this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);

        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", getClass().getSimpleName(), decimalFormat.format(kilometers));
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), this.fuelQuantity);
    }
}
