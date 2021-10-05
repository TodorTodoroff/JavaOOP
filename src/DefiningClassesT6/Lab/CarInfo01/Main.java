package DefiningClassesT6.Lab.CarInfo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Object> carList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        Car car = new Car();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            car.setBrand(input[0]);
            car.setModel(input[1]);
            car.setHorsePower(Integer.parseInt(input[2]));
            carList.add(car);
            car = new Car();
        }
        for (Object o : carList) {
            System.out.println(o.toString());
        }

    }
}
