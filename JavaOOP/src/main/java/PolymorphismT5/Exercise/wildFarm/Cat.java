package PolymorphismT5.Exercise.wildFarm;


public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, int foodEaten, String breed) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eatFood(Food food) {
        super.eatFood(food);
    }
}
