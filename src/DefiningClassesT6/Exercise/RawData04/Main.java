package DefiningClassesT6.Exercise.RawData04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carNumber = Integer.parseInt(scanner.nextLine());
        Car car;
        Engine engine;
        Cargo cargo;
        Tire tire1;
        Tire tire2;
        Tire tire3;
        Tire tire4;
        List<Car> cars = new ArrayList<>();

        while (carNumber-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");
            String model = command[0];
            int engineSpeed = Integer.parseInt(command[1]);
            int enginePower = Integer.parseInt(command[2]);
            int cargoWeight = Integer.parseInt(command[3]);
            String cargoType = command[4];
            double tirePressure1 = Double.parseDouble(command[5]);
            int tireAge1 = Integer.parseInt(command[6]);
            double tirePressure2 = Double.parseDouble(command[7]);
            int tireAge2 = Integer.parseInt(command[8]);
            double tirePressure3 = Double.parseDouble(command[9]);
            int tireAge3 = Integer.parseInt(command[10]);
            double tirePressure4 = Double.parseDouble(command[11]);
            int tireAge4 = Integer.parseInt(command[12]);
            engine = new Engine(engineSpeed, enginePower);
            cargo = new Cargo(cargoWeight, cargoType);
            tire1 = new Tire(tirePressure1, tireAge1);
            tire2 = new Tire(tirePressure2, tireAge2);
            tire3 = new Tire(tirePressure3, tireAge3);
            tire4 = new Tire(tirePressure4, tireAge4);

            car = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);

            cars.add(car);

        }

        String command = scanner.nextLine();
        List<String> output = new ArrayList<>();
        if (command.equals("fragile")) {
            cars.forEach(x -> {
                if (x.getCargo().getCargoType().equals("fragile")) {
                    for (Tire allTires : x.getTires()) {
                        if (allTires.getTirePressure() < 1) {
                            output.add(x.getModel());
                            break;
                        }
                    }
                }
            });
        } else if (command.equals("flamable")) {
            cars.forEach(y -> {
                if (y.getCargo().getCargoType().equals("flamable") && y.getEngine().getEnginePower() > 250) {
                    output.add(y.getModel());
                }
            });
        }
        output.forEach(System.out::println);

    }
}
