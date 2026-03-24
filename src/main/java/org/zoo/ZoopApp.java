package org.zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class ZoopApp {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("""
                Welcome to the Zoo Management System
                ====================================""");

        Scanner sc = new Scanner(System.in);
        int option = 0;

        while(option != 4){

            System.out.println("""
                
                MENU
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

    public static void addAnimal(Scanner sc, ArrayList<Animal> animals){

        System.out.println("""
                
                1. Lion
                2. Elephant
                3. Bird
                4. Gorilla
                5.Snake
                6. Shark
                """);

        System.out.print("Please choose the species you want to add by its number on the list: ");
        int choice = sc.nextInt();
        sc.nextLine();

        chooseAnimal(choice, sc, animals);


    }

    public static void chooseAnimal(int choice, Scanner sc, ArrayList<Animal> list){

        switch (choice){
            case 1 :
                System.out.print("Now give you Lion a name: ");
                String lionName = sc.nextLine();
                Animal lion = new Lion(lionName, "lion");
                list.add(lion);
                break;
            case 2 : System.out.print("Now give your Elephant a name: ");
                String elephantName = sc.nextLine();
                Animal elephant = new Elephant(elephantName, "elephant");
                list.add(elephant);
                break;
            case 3 :
                System.out.print("Now give your Bird a name: ");
                String birdName = sc.nextLine();
                Animal bird = new Bird(birdName, "bird");
                list.add(bird);
                break;
            case 4 :
                System.out.print("Now give your Gorilla a name: ");
                String gorillaName = sc.nextLine();
                Animal gorilla = new Gorilla(gorillaName, "gorilla");
                list.add(gorilla);
                break;
            case 5 :
                System.out.print("Now give you Snake a name: ");
                String snakeName = sc.nextLine();
                Animal snake = new Snake(snakeName, "snake");
                list.add(snake);
                break;
            case 6 :
                System.out.print("Now give you Shark a name: ");
                String sharkName = sc.nextLine();
                Animal shark = new Shark(sharkName, "shark");
                list.add(shark);
                break;
            default:
                System.out.println("Choose between number 1-6.");
        }

        System.out.println("--------------------------");
    }


    public static void viewAnimals(ArrayList<Animal> animals){
        System.out.println("""
                
                Animal List
                -----------""");
        for(Animal newAnimal : animals){
            System.out.println("Name: " + newAnimal.getName() +
                    "\nspecies: " + newAnimal.getSpecies());
            newAnimal.makeSound();
            System.out.println();
        }

        System.out.println("""
                -----------""");
    }

    public static void searchAnimal(Scanner sc, ArrayList<Animal> animals){
        System.out.println("Enter animal name to search: ");
        String name = sc.nextLine();

        boolean notFound = false;

        for(Animal animal: animals){
            if(name.equalsIgnoreCase(animal.getName())){
                System.out.println("Animal Found");
                System.out.println("Name: " + animal.getName() +
                        "\nspecies: " + animal.getSpecies());
                notFound = true;
            }

        }

        if(!notFound){
            System.out.println(name + " not found!");
        }


    }
}