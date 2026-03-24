package org.zoo;

public class Gorilla extends Animal{
    public Gorilla(String name, String species) {
        super(name, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Belches");
    }
}
