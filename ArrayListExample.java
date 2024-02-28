import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
 public static void main(String[] args) {
 // Create an ArrayList of type String
 ArrayList<String> namesList = new ArrayList<>();
 // Prompt the user for three names and add them to the ArrayList
 Scanner scanner = new Scanner(System.in);
 for (int i = 1; i <= 3; i++) {
 System.out.print("Enter name " + i + ": ");
 String name = scanner.nextLine();
 namesList.add(name);
 }
 // Print the number of elements in the ArrayList
 System.out.println("Number of elements in the ArrayList: " + namesList.size());
 // Prompt the user for two more names and add them to the ArrayList
 for (int i = 4; i <= 5; i++) {
 System.out.print("Enter name " + i + ": ");
 String name = scanner.nextLine();
 namesList.add(name);
 }
 // Print the number of elements in the updated ArrayList
 System.out.println("Number of elements in the updated ArrayList: " + namesList.size());
 // Use a loop to print all of the names in the ArrayList
 System.out.println("Names in the ArrayList:");
 for (String name : namesList) {
 System.out.println(name);
}
 // Ask the user for a name to remove
 System.out.print("Enter a name to remove: ");
 String nameToRemove = scanner.nextLine();
 // Remove the name provided by the user
 namesList.remove(nameToRemove);
 // Use an enhanced for loop to print all of the names in the updated ArrayList
 System.out.println("Names in the updated ArrayList:");
 for (String name : namesList) {
 System.out.println(name);
 }
 // Close the scanner
 scanner.close();
 }
}