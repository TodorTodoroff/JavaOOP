package Generics7.Lab.ArrayCreator02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    public static <T> T[] create(int lenght, T def) {
        T[] arr = (T[]) Array.newInstance(def.getClass(),lenght);
        Arrays.fill(arr,def);
        return arr;
    }
    public static <T> T[] create(Class<T> clazz,int lenght, T def) {
        T[] arr = (T[])Array.newInstance(def.getClass(),lenght);
        Arrays.fill(arr,def);
        return arr;
    }
}
