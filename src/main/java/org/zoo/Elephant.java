package org.zoo;

public class Elephant extends Animal {

    public Elephant(String name, String species){
        super("Glory", "elephant");
    }


    @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }
}
