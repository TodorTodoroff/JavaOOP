package WorkingWithAbstractionT1.Lab.StudentSystem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        while (true) {
            String[] input = scanner.nextLine().split("\\s+");

            if (input[0].equals("Exit")) {
                break;
            }

            String output = studentSystem.parseCommand(input);
            if (output != null) {
                System.out.println(output);
            }
        }
    }
}
