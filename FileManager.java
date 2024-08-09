package org.example;

        import java.io.*;
        import java.util.ArrayList;

public class FileManager {

    public static void saveMonsters(ArrayList<Monster> monsters, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Monster m : monsters) {
                writer.write(m.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving monsters: " + e.getMessage());
        }
    }

    public static ArrayList<Monster> loadMonsters(String filename) {
        ArrayList<Monster> monsters = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                // Create Monster based on parts
                // You need to add logic for distinguishing and creating specific types of monsters
            }
        } catch (IOException e) {
            System.out.println("Error loading monsters: " + e.getMessage());
        }
        return monsters;
    }
}

