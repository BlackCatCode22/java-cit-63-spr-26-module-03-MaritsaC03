package myanimals;
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println("Dog created. Total animals: " + numOfAnimals);
    }
}
