// Main.java
//Name - Manan Khanna
//PRN - 23070126156
//Batch - AIML B3
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Student details
        // Name: [Your Name]
        // PRN: [Your PRN]
        // Batch: [Your Batch]

        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Card");
            System.out.println("3. Find a Card");
            System.out.println("4. Shuffle Deck");
            System.out.println("5. Deal 5 Random Cards");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter card rank: ");
                    String rank = scanner.next();
                    System.out.print("Enter card suit: ");
                    String suit = scanner.next();
                    deck.findCard(rank, suit);
                    break;
                case 4:
                    deck.shuffleDeck();
                    break;
                case 5:
                    deck.dealCard();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
        scanner.close();
    }
}
