package org.example;

public class AquaticMonster extends Monster {
    private final int swimSpeed;

    public AquaticMonster(String name, String color, int strength, int speed, int swimSpeed) {
        super(name, color, strength, speed);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void performSpecialAbility() {
        System.out.println(getName() + " can swim at " + swimSpeed + " km/h.");
    }

    @Override
    public String toString() {
        return super.toString() + "," + swimSpeed;
    }

    public static AquaticMonster loadFromFile(String filename) {
        // Implement specific logic for loading AquaticMonster
        return null;
    }
}

