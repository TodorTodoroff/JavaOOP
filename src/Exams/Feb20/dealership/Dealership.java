package Exams.Feb20.dealership;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dealership {
    public String name;
    public int capacity;
    public List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (data.size() < capacity) {
            data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        return data.removeIf(car -> car.getManufacturer().equals(manufacturer) && car.getModel().equals(model));
    }

    public Car getLatestCar() {
        if (!data.isEmpty()) {
            List<Car> latest = data.stream().sorted((x, y) -> Integer.compare(y.getYear(), x.getYear())).collect(Collectors.toList());
            return latest.get(0);
        }
        return null;
    }

    public Car getCar(String manufacturer, String model) {
        for (Car datum : data) {
            if (datum.getManufacturer().equals(manufacturer) && datum.getModel().equals(model)) {
                return datum;
            }
        }
        return null;
    }

    public int getCount(){
        if (data.isEmpty()){
            return 0;
        }else {
            return data.size();
        }
    }

    public String getStatistics(){
        StringBuilder out = new StringBuilder(String.format("The cars are in a car dealership %s:%n",this.name));
        for (Car car : data) {
            out.append(car).append("\n");
        }

        return out.toString().trim();
    }

}
