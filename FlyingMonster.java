package org.example;

public class FlyingMonster extends Monster {
    private final int wingSpan;

    public FlyingMonster(String name, String color, int strength, int speed, int wingSpan) {
        super(name, color, strength, speed);
        this.wingSpan = wingSpan;
    }

    @Override
    public void performSpecialAbility() {
        System.out.println(getName() + " can fly with a wingspan of " + wingSpan + " meters.");
    }

    @Override
    public String toString() {
        return super.toString() + "," + wingSpan;
    }

    public static FlyingMonster loadFromFile(String filename) {
        // Implement specific logic for loading FlyingMonster
        return null;
    }
}

