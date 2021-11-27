package InterfacesAndAbstractionT4.Exercises.telephony;

import java.util.List;

public class SmartPhone implements Callable,Browsable{
    private List<String> numbers;
    private List<String> urls;

    public SmartPhone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        return this.urls.toString();
    }

    @Override
    public String call() {
        return this.numbers.toString();
    }
}
