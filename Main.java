package myanimals;

public class Main {

        public static void main(String[] args) {


            Dog dog1 = new Dog("Biscuit");
            Cat cat1 = new Cat("Tiny");
            Dog dog2 = new Dog("Coco");
            Cat cat2 = new Cat("Octavia");


            System.out.println("Final number of animals: " + Animal.getNumOfAnimals());
        }
    }


