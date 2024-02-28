import java.util.ArrayList;
import java.util.List;
public class ListManipulation {
 public static void main(String[] args) {
 // Creating a List
 List<String> myList = new ArrayList<>();
 // Adding elements to the start of the list
 myList.add(0, "Element1");
 myList.add(0, "Element2");
 // Adding elements to the end of the list
 myList.add("Element3");
 myList.add("Element4");
 // Displaying the list before removal
 System.out.println("List before removal: " + myList);
 // Obtaining and removing the first element
 String firstElement = myList.remove(0);
 // Obtaining and removing the last element
 String lastElement = myList.remove(myList.size() - 1);
 // Displaying the list after removal
 System.out.println("List after removal: " + myList);
 // Displaying the first and last elements that were removed
 System.out.println("First element removed: " + firstElement);
 System.out.println("Last element removed: " + lastElement);
 }
}