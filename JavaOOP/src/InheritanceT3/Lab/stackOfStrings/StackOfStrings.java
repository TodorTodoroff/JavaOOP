package InheritanceT3.Lab.stackOfStrings;

import java.util.ArrayList;

public class StackOfStrings extends ArrayList<String> {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String peek() {
        int index = this.data.size() - 1;
        return this.data.get(index);
    }

    public String pop() {
        int index = this.data.size() - 1;
        return this.data.remove(index);
    }
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
}
