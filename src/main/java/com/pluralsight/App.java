package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add(new Character("Luke Skywalker", 172, 77, "blue", "male"));
        characters.add(new Character("Darth Vader", 202, 136, "yellow", "male"));
        characters.add(new Character("Leia Organa", 150, 49, "brown", "female"));
        characters.add(new Character("Anakin Skywalker", 188, 84, "blue", "male"));

        // 1. Print names in UPPERCASE using map and forEach
        characters.stream()
                .map(character -> character.getName().toUpperCase())
                .forEach(name -> System.out.println(name));

        // 2. Filter characters with mass > 80 using .filter and .collect(Collectors.toList())
        // store the results in a variable called heavyCharacters and display the new list
        //creating a new list to hold our thick characters
        //using stream and filter method to ask if the mass > 80
        //if it is they get added to the new list, if not they are omitted from the new list
        List<Character> thickCharacters = characters.stream()
                .filter(character -> character.getMass() > 80)
                .toList();
        //looping over thickCharacters to display the list
        thickCharacters.forEach(character -> System.out.println(character.getName() + " " + character.getMass()));

        // 3. Create a new list of just character names using .filter and .collect(Collectors.toList())
        // the new list should be called names. Display the new list with a loop
        List<String> names = characters.stream()
                .map(character -> character.getName())
                .toList();
        //looping over the name
        names.forEach(name -> System.out.println(name));

        // 4. Use anyMatch to check for blue eyes and let us know if any character has blue eyes
        boolean hasBlueEyes = characters.stream()
                .anyMatch(character -> character.getEyeColor().equalsIgnoreCase("blue"));

        if (hasBlueEyes) {
            System.out.println("\nSome characters have blue eyes");
        } else {
            System.out.println("\nNo characters have blue eyes");
        }

        // 5. Use allMatch to check if all are male and let us know if all characters are male
        boolean allMale = characters.stream()
                .allMatch(character -> character.getGender().equalsIgnoreCase("male"));

        if (allMale) {
            System.out.println("\nAll the characters are male");
        } else {
            System.out.println("\nNot all the characters are male");
        }

        // 6. Use .mapToInt and .sum to calculate total mass of all characters and then display the total mass
        int totalMass = characters.stream()
                .mapToInt(character -> character.getMass())
                .sum();

        System.out.println("\nTotal mass: " + totalMass);
        System.out.println("Average mass: " + totalMass / characters.size());
    }
}