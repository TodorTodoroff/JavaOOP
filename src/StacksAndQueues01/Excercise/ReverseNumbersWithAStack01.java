package StacksAndQueues01.Excercise;

import java.util.ArrayDeque;

import java.util.Scanner;

public class ReverseNumbersWithAStack01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");

        for (String element : input) {
            numbers.push(Integer.parseInt(element));
        }

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }

    }
}
