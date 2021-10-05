package DefiningClassesT6.Lab.CarInfo01;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

@Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP."
                , this.getBrand(), this.getModel(), this.getHorsePower());
    }
}
