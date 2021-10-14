package Generics7.Lab.GenericScale03;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scale<>(13,14).getHeavier());
        System.out.println(new Scale<>("a","b").getHeavier());
        System.out.println(new Scale<>('a','c').getHeavier());

    }

}
