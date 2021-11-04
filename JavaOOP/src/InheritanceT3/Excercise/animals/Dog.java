package InheritanceT3.Excercise.animals;

public class Dog extends Animal{
    public Dog (String name,int age,String gender){
        super(name,age,gender);
    }
    @Override
    public String produceSound(){
        return "Woof!";
    }
}
