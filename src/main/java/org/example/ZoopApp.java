package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZoopApp {
    public static void main(String[] args) {
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

            switch (option){
                case 1 : System.out.println("Chose option 1");
                break;
                case 2 : System.out.println("Chose option 2");
                break;
                case 3 : System.out.println("Chose option 3");
                break;
                default: System.out.println("Choose between options 1-4");
            }
        }

        System.out.println("Goodbye");
    }
}