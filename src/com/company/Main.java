package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Player ant = new Player("Ant", 10, 15);
        System.out.println(ant.toString());
        saveObject(ant);

        ant.setHitPoints(30);
        ant.setWeapon("Kaboooom");
        saveObject(ant);
         // loadObject(ant);
        System.out.println(ant.toString());

        ISavable wolf = new Monster("Wolf", 30, 50);
        System.out.println("Hitpoint of wolf is " + ((Monster) wolf).getHitPoints());
        System.out.println(wolf);
        saveObject(wolf);

    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        List<String> valuese = readValues();
        objectToLoad.read(valuese);
    }
}
