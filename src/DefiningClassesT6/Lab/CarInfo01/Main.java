package DefiningClassesT6.Lab.CarInfo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());


        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            Car car;
            if (input.length > 1) {
                car = new Car(input[0], input[1], Integer.parseInt(input[2]));
            } else {
               car = new Car(input[0]);
            }
                carList.add(car);
        }
        for (Object o : carList) {
            System.out.println(o);
        }

    }
}
