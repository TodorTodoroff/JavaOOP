package Generics7.Lab.GenericScale03;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        int compared = left.compareTo(right);
        if (compared > 0) return left;
        if (compared < 0) return right;

        return null;

    }


}
