package MultidimensionalArraysT2.Exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
