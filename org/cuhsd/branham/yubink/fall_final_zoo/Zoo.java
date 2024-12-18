package org.cuhsd.branham.yubink.fall_final_zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A zoo that can add, search, and view animals.
 * @author Yubin Kim
 * @version 1.0.0
 */
public class Zoo {
    // ArrayList to list all animals

    static List<Animal> animals = new ArrayList<Animal>();

    /**
     * Main program
     * @param args No input
     */
    public static void main(String[] args) {
        // Creating a Zoo object
        Zoo myZoo = new Zoo();

        // Asking what user wants to do
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the Zoo! Would you like to add, search, or view animals? (A/S/V)");
            String action = input.nextLine();
            if (action.equals("A")) {
                System.out.println("Enter name: ");
                String name = input.nextLine();
                System.out.println("Enter species: ");
                String species = input.nextLine();
                myZoo.add(name, species);
                System.out.println("Animal added!");
            }
            else if (action.equals("S")) {
                System.out.println("Enter name: ");
                String name = input.nextLine();
                Animal searchedAnimal = myZoo.search(name);

                // Indicating if searched animal does not exist
                if (searchedAnimal == null) {
                    System.out.println("Animal not found.");
                } else {
                    System.out.println(searchedAnimal);
                }
            }
            else if (action.equals("V")) {
                if (animals.size() == 0) {
                    System.out.println("No animals in Zoo.");
                }
                myZoo.printAnimals();
            }

            System.out.println("Continue (Y/N): ");
            if (input.nextLine().equals("N")) {
                System.out.println("Thanks for visiting!");
                break;
            }
        }
    }

    // Alternative way to create Animal objects
//    public void add(Animal animal) {
//        animals.add(animal);
//    }

    /**
     * Adds a new Animal object
     * @param name the animal name
     * @param species the animal species
     */
    public void add(String name, String species) {
        animals.add(new Animal(name, species));
    }

    /**
     * Searches for a specific Animal
     * @param animalName the animal's name
     * @return the searched Animal object
     */
    public Animal search(String animalName) {
        int i = 0;
        while (i < animals.size()) {
            if (animals.get(i).getName().equals(animalName)) {
                return animals.get(i);
            }
            i++;
        }
        return null;
    }

    /**
     * Prints a list of all Animals
     */
    public void printAnimals() {
//        System.out.println(animals);
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + ": " + animals.get(i));
        }
    }
}
