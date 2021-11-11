package PolymorphismT5.Exercise.vehicle;

public class Bus extends VehicleImpl {
    private boolean isEmpty;
    private static final double AC_ADDITIONAL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.isEmpty = false;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        if (!isEmpty)
        super.setFuelConsumption(fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    public String drive(double kilometers) {
        return super.drive(kilometers);
    }

    @Override
    public void refuel(double fuelRefueled) {
        super.refuel(fuelRefueled);
    }
}
