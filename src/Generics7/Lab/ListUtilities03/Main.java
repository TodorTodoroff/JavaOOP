package Generics7.Lab.ListUtilities03;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(11, 14, 15, 16);
        System.out.println(ListUtils.getMin(list));
        System.out.println(ListUtils.getMax(list));

    }
}
