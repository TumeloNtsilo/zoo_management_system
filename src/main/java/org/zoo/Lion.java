package org.zoo;

public class Lion extends Animal{

    public Lion(String name, String species){
        super(name, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}
