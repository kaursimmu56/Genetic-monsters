package org.example;

 import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonsterManager manager = new MonsterManager();

        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. Create Monster");
            System.out.println("2. View Monsters");
            System.out.println("3. Breed Monsters");
            System.out.println("4. Save Game");
            System.out.println("5. Load Game");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter monster name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter color:");
                    String color = scanner.nextLine();
                    System.out.println("Enter strength:");
                    int strength = scanner.nextInt();
                    System.out.println("Enter speed:");
                    int speed = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    Monster monster = new FlyingMonster(name, color, strength, speed, 10); // Example
                    manager.addMonster(monster);
                    System.out.println("Monster created: " + monster);
                    break;
                case 2:
                    System.out.println("Detailed view? (true/false):");
                    boolean detailed = scanner.nextBoolean();
                    scanner.nextLine();  // Consume newline
                    manager.displayMonsters(detailed);
                    break;
                case 3:
                    System.out.println("Enter index of first monster:");
                    int index1 = scanner.nextInt();
                    System.out.println("Enter index of second monster:");
                    int index2 = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    manager.breedMonsters(index1, index2);
                    break;
                case 4:
                    System.out.println("Enter filename to save:");
                    String saveFilename = scanner.nextLine();
                    manager.saveGame(saveFilename);
                    System.out.println("Game saved successfully.");
                    break;
                case 5:
                    System.out.println("Enter filename to load:");
                    String loadFilename = scanner.nextLine();
                    manager.loadGame(loadFilename);
                    System.out.println("Game loaded successfully.");
                    break;
                case 6:
                    System.out.println("Are you sure you want to exit? (yes/no)");
                    String exitConfirm = scanner.nextLine();
                    if (exitConfirm.equalsIgnoreCase("yes")) {
                        System.out.println("Exiting game.");
                        scanner.close();
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
