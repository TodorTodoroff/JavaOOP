package StacksAndQueues01.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binary =  new ArrayDeque<>();

        if (n == 0){
            System.out.println(n);
        }else {
            while (n > 0){
                binary.push(n%2);
                n /= 2;
            }
        }
        for(Integer pop : binary){
            System.out.print(pop);
        }
    }
}
