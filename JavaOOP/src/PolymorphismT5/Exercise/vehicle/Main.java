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
        double carTank = Double.parseDouble(line[3]);

        Vehicle car = new Car(carFuel, carConsumption, carTank);

        line = scanner.nextLine().split("\\s+");
        double truckFuel = Double.parseDouble(line[1]);
        double truckConsumption = Double.parseDouble(line[2]);
        double truckTank = Double.parseDouble(line[3]);

        Vehicle truck = new Truck(truckFuel, truckConsumption, truckTank);

        line = scanner.nextLine().split("\\s+");
        double busFuel = Double.parseDouble(line[1]);
        double busConsumption = Double.parseDouble(line[2]);
        double busTank = Double.parseDouble(line[3]);

        Vehicle bus = new Bus(busFuel, busConsumption, busTank);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus",bus);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
                line = scanner.nextLine().split("\\s+");
                String vehicleType = line[1];
                String commandName = line[0];
                Vehicle vehicle = vehicles.get(vehicleType);

            try {
                switch (commandName) {
                    case "Drive":
                        double distance = Double.parseDouble(line[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(false);
                        }
                        System.out.println(vehicles.get(vehicleType).drive(distance));
                        break;
                    case "Refuel":
                        double liters = Double.parseDouble(line[2]);
                        vehicles.get(vehicleType).refuel(liters);
                        break;
                    case "DriveEmpty":
                        double distanceBus = Double.parseDouble(line[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(true);
                        }
                        System.out.println(vehicles.get(vehicleType).drive(distanceBus));
                        break;
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }
        vehicles.values().forEach(System.out::println);

    }
}
