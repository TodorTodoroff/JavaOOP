package DefiningClassesT6.Exercise.SpeedRacing03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();
        Car car;

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        while (numberOfCars-- > 0) {
            String[] command = scanner.nextLine().split(" ");
            String model = command[0];
            double fuel = Double.parseDouble(command[1]);
            double fuelCost = Double.parseDouble(command[2]);
            car = new Car(model, fuel, fuelCost);
            cars.put(model, car);
        }

        String[] driveCommand = scanner.nextLine().split(" ");

        while (!driveCommand[0].equals("End")) {
            String model = driveCommand[1];
            double amountKm = Double.parseDouble(driveCommand[2]);
            if(!cars.get(model).drive(amountKm)){
                System.out.println("Insufficient fuel for the drive");
            }

            driveCommand = scanner.nextLine().split(" ");
        }
        cars.values().forEach(System.out::println);
    }
}
