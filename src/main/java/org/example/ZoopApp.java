package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZoopApp {
    public static void main(String[] args) {
        ArrayList<String[]> animals = new ArrayList<>();

        System.out.println("""
                Welcome to the Zoo Management System
                ====================================
                """);

        Scanner sc = new Scanner(System.in);
        int option = 0;

        while(option != 4){

            System.out.println("""
                
                1. View Animals
                2. Add Animal
                3. Search Animal
                4. Exit
                """);
            System.out.print("option (1-4): ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1 : viewAnimals(animals);
                break;
                case 2 : addAnimal(sc, animals);
                break;
                case 3 : searchAnimal(sc, animals);
                break;
                default: System.out.println("Choose between options 1-4");
            }
        }

        System.out.println("Goodbye");
    }

    public static void addAnimal(Scanner sc, ArrayList<String[]> animals){

        String[] animal = new String[2];
        System.out.println("Enter the name and species of the animal.");
        System.out.print("Name: ");

        String name = sc.nextLine();

        System.out.print("Species: ");
        String species = sc.nextLine();
        Animal animal_ = new Animal(name, species);


        animal[0] = animal_.name;
        animal[1] = animal_.species;


        animals.add(animal);


    }

    public static void viewAnimals(ArrayList<String[]> animals){
        System.out.println("""
                
                Animal List
                -----------""");
        for(String[] newAnimal : animals){
            System.out.println("Name: " + newAnimal[0] +
                    "\nspecies: " + newAnimal[1] + "\n");
        }

        System.out.println("""
                -----------""");
    }

    public static void searchAnimal(Scanner sc, ArrayList<String[]> animals){
        System.out.println("Enter animal name to search: ");
        String name = sc.nextLine();

        for(String[] animal: animals){
            if(name.equalsIgnoreCase(animal[0])){
                System.out.println("Animal Found");
                System.out.println("Name: " + animal[0] +
                        "\nspecies: " + animal[1]);
            }
            else{
                System.out.println("Animal not found!");
            }
        }
    }
}