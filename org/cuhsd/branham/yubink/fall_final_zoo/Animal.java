package org.cuhsd.branham.yubink.fall_final_zoo;

/**
 * An Animal class that is assigned a name and species.
 * @author Yubin Kim
 * @version 1.0.0
 */
public class Animal {
    private String name;
    private String species;

    /**
     * Constructor to create a new Animal object
     * @param name the animal's name
     * @param species the animal species
     */
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    /**
     * Returns the name of the Animal
     * @return animal name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the species of the Animal
     * @return animal species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Override toString for object
     * @return name - species
     */
    @Override
    public String toString() {
        return name + " - " + species;
    }
}
