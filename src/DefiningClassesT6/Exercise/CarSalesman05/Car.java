package DefiningClassesT6.Exercise.CarSalesman05;


public class Car {
    private String model;
    private Engine engine;

    //optional
    private int weight;
    private String colour;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.colour = "n/a";
    }

    public Car(String model, Engine engine, int weight, String colour) {
        this(model, engine);
        this.weight = weight;
        this.colour = colour;
    }

    public Car(String model, Engine engine, String colour) {
        this(model, engine);
        this.colour = colour;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    @Override
    public String toString() {
    String printWeight;
    if (weight ==0){
        printWeight = "n/a";

    }else {
        printWeight = weight + "";

    }
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(model).append(":").append("\n")
            .append(engine.toString()).append("\n")
            .append("Weight: " + printWeight).append("\n")
            .append("Color: " + colour);
    return stringBuilder.toString();
    }
}
