package myanimals;
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        System.out.println("Cat created. Total animals: " + numOfAnimals);
    }
}
