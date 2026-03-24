package org.zoo;

public class Shark extends Animal{
    public Shark(String name, String species) {
        super(name, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Hissing");
    }
}
