Package org.example;

import java.util.ArrayList;

public class MonsterManager {
    private final ArrayList<Monster> monsters;

    public MonsterManager() {
        this.monsters = new ArrayList<>();
    }

    public void addMonster(Monster m) {
        monsters.add(m);
    }

    public void breedMonsters(int index1, int index2) {
        if (index1 >= 0 && index1 < monsters.size() && index2 >= 0 && index2 < monsters.size()) {
            Monster parent1 = monsters.get(index1);
            Monster parent2 = monsters.get(index2);

            // Simplistic breeding logic for demonstration
            String name = parent1.getName() + "-" + parent2.getName();
            String color = parent1.getColor(); // Simplified: same as parent1
            int strength = (parent1.getStrength() + parent2.getStrength()) / 2;
            int speed = (parent1.getSpeed() + parent2.getSpeed()) / 2;

            Monster offspring = new FlyingMonster(name, color, strength, speed, 10); // Example: FlyingMonster offspring
            addMonster(offspring);

            System.out.println("New offspring created: " + offspring);
        } else {
            System.out.println("Invalid indices for breeding.");
        }
    }

    public void saveGame(String filename) {
        Object FileManager = null;
        Object clone = FileManager.getClass();
    }

    public void loadGame(String filename) {
        Object FileManager = null;
        FileManager.notify();
    }

    public void displayMonsters(boolean detailed) {
        for (Monster m : monsters) {
            System.out.println(detailed ? m.toString() : m.getName());
        }
    }
}
