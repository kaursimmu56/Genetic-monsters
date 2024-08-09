package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Monster implements Serializable {
    private final String name;
    private final String color;
    private final int strength;
    private final int speed;

    public Monster(String name, String color, int strength, int speed) {
        this.name = name;
        this.color = color;
        this.strength = strength;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void performSpecialAbility();

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(this.toString());
        } catch (IOException e) {
            System.out.println("Error saving monster: " + e.getMessage());
        }
    }

    public static Monster loadFromFile(String filename) {
        // Implement specific logic for loading monster
        return null;
    }

    @Override
    public String toString() {
        return name + "," + color + "," + strength + "," + speed;
    }
}

