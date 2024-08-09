package org.example;

public class DesertMonster extends Monster {
    private final int heatResistance;

    public DesertMonster(String name, String color, int strength, int speed, int heatResistance) {
        super(name, color, strength, speed);
        this.heatResistance = heatResistance;
    }

    @Override
    public void performSpecialAbility() {
        System.out.println(getName() + " can withstand heat with a resistance of " + heatResistance + ".");
    }

    @Override
    public String toString() {
        return super.toString() + "," + heatResistance;
    }

    public static DesertMonster loadFromFile(String filename) {
        // Implement specific logic for loading DesertMonster
        return null;
    }
}

