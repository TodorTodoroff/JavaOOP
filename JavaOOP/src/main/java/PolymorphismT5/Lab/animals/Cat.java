package PolymorphismT5.Lab.animals;

public class Cat extends Animal {


    public Cat(String oscar, String whiskas) {
        super(oscar, whiskas);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nMEEOW", super.getName(), super.getFavouriteFood());
    }
}
