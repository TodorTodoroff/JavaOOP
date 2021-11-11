package PolymorphismT5.Exercise.vehicle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        double carFuel = Double.parseDouble(line[1]);
        double carConsumption = Double.parseDouble(line[2]);

        Vehicle car = new Car(carFuel, carConsumption);

        line = scanner.nextLine().split("\\s+");
        double truckFuel = Double.parseDouble(line[1]);
        double truckConsumption = Double.parseDouble(line[2]);

        Vehicle truck = new Truck(truckFuel, truckConsumption);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            line = scanner.nextLine().split("\\s+");
            String vehicleType = line[1];
            String commandName = line[0];

            switch (commandName) {
                case "Drive":
                    double distance = Double.parseDouble(line[2]);
                    System.out.println(vehicles.get(vehicleType).drive(distance));
                    break;
                case "Refuel":
                    double liters = Double.parseDouble(line[2]);
                    vehicles.get(vehicleType).refuel(liters);
                    break;
            }

        }
        vehicles.values().forEach(System.out::println);

    }
}
