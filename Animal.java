package myanimals;

public class Animal {

    protected static int numOfAnimals = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        numOfAnimals++;
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }
}


