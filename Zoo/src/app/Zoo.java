package app;

import model.Animal;
import model.Dog;
import model.Elephant;

public class Zoo {
    public static void main(String[] args) {
//        Animal dog = new Dog("Burek", "Black", 25.5);
//        Animal elephant = new Elephant("Dumbo", "Gray", 125.8);
//
//        dog.showInfo();
//        elephant.showInfo();

//        Dog[] dogs = new Dog[1];
//        dogs[0] = new Dog("Burek", "Black", 25.5);
//
//        Elephant[] elephants = new Elephant[1];
//        elephants[0] = new Elephant("Dumbo", "Gray", 125.8);

        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Burek", "Black", 25.5);
        animals[1] = new Elephant("Dumbo", "Gray", 125.8);
//        animals[2] = new Animal ("Noga", "White"); // abstract powoduje że nie można tworzyć obiektu, który nie jest określony przez podrzędny

        for (Animal animal : animals) {
            animal.showInfo();
        }

//        for (Dog dog : dogs) {
//            dog.showInfo();
//        }
//
//        for (Elephant elephant : elephants) {
//            elephant.showInfo();
//        }

    }
}
