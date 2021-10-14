package Generics7.Exercise.GenericCountMethodDouble06;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T>>{
    List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public int countOfGreaterItems(T element) {
        return (int) values.stream().filter(value -> value.compareTo(element) > 0).count();
    }
}
