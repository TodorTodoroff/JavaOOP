package PolymorphismT5.Exercise.vehicle;

public class Truck extends VehicleImpl {
    private static final double AC_ADDITIONAL_CONSUMPTION = 1.6;
    private static final double FUEL_LOSS_DUE_TO_HOLE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void refuel(double fuelRefueled) {
        super.refuel(fuelRefueled * FUEL_LOSS_DUE_TO_HOLE);
    }
}
