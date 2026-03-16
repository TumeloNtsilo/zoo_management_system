package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZoopApp {
    public static void main(String[] args) {
        Animal animal= new Animal();
        String[] animalArray = new String[2];
        ArrayList<String[]> animals = new ArrayList<>();

        System.out.println("""
                Welcome to the Zoo Management System
                ====================================
                """);

        System.out.println("""
                1. View Animals
                2. Add Animal
                3. Search Animal
                4. Exit
                """);
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while(option != 4){
            System.out.print("option (1-4): ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1 : viewAnimals(animals);
                break;
                case 2 : addAnimal(animal, sc, animalArray, animals);
                break;
                case 3 : System.out.println("Chose option 3");
                break;
                default: System.out.println("Choose between options 1-4");
            }
        }

        System.out.println("Goodbye");
    }

    public static void addAnimal(Animal animal_, Scanner sc, String[] animal, ArrayList<String[]> animals){

        System.out.println("Enter the name and species of the animal.");
        System.out.print("Name: ");
        animal_.name = sc.nextLine();

        System.out.print("Species: ");
        animal_.species = sc.nextLine();

        animal[0] = animal_.name;
        animal[1] = animal_.species;


        animals.add(animal);


    }

    public static void viewAnimals(ArrayList<String[]> animals){
        for(String[] newAnimal : animals){
            System.out.println(Arrays.toString(newAnimal));
        }
    }
}