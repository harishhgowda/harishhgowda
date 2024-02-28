import java.util.Scanner;
public class CharacterOccurrenceCounter {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 // Input the string
 System.out.print("Enter a string: ");
 String inputString = scanner.nextLine();
 // Input the character to count
 System.out.print("Enter the character to count: ");
 char targetCharacter = scanner.next().charAt(0);
 // Count occurrences using string handling functions
 int count = countOccurrences(inputString, targetCharacter);
 // Display the result
 System.out.println("Occurrences of '" + targetCharacter + "' in the string: " + count);
 }
 private static int countOccurrences(String inputString, char targetCharacter) {
 int count = 0;
 for (char c : inputString.toCharArray()) {
 if (c == targetCharacter) {
 count++;
 }
 }
 return count;
 }
}