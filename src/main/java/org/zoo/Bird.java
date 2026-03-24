package org.zoo;

public class Bird extends Animal{

    public Bird(String name, String species){
        super(name, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Chip");
    }
}
